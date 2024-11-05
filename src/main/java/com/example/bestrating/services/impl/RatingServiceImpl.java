package com.example.bestrating.services.impl;

import com.example.bestrating.models.entities.Rating;
import com.example.bestrating.repositories.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.bestrating.services.RatingService;

@Service
public class RatingServiceImpl implements RatingService {
    private final RatingRepository ratingRepository;

    @Autowired
    public RatingServiceImpl(RatingRepository ratingRepository) {
        this.ratingRepository = ratingRepository;
    }

    @Transactional
    public void updateRating(String userId, int score) {
        Rating rating = ratingRepository.findByUserId(userId);
        if (rating == null) {
            rating = new Rating();
            rating.setUserId(userId);
            rating.setScore(score);
        } else {
            rating.setScore(rating.getScore() + score);
        }
        ratingRepository.save(rating);
    }

    public void testing() {
        System.out.println("Testing");
    }
}