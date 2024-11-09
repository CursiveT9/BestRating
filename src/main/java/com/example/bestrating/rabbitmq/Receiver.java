package com.example.bestrating.rabbitmq;

import com.example.bestrating.services.impl.RatingServiceImpl;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.concurrent.CountDownLatch;

@Component
public class Receiver {

    private CountDownLatch latch = new CountDownLatch(1);

    private RatingServiceImpl ratingServiceImpl;

    @Autowired
    public Receiver(RatingServiceImpl ratingServiceImpl) {
        this.ratingServiceImpl = ratingServiceImpl;
    }

    @RabbitListener(queues = "rating-update", ackMode = "AUTO")
    public void receiveMessage(String message) {
        System.out.println("Received <" + message + ">");
        String[] parts = message.split(":");
        if (parts.length == 2) {
            String userId = parts[0];
            int score = Integer.parseInt(parts[1]);
            updateUserRating(userId, score);
        }
        latch.countDown();
    }

    private void updateUserRating(String userId, int score) {
        ratingServiceImpl.updateRating(userId, score);
    }

    public CountDownLatch getLatch() {
        return latch;
    }

}
