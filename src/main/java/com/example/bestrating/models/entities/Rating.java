package com.example.bestrating.models.entities;

import com.example.bestrating.models.baseEntities.TimestampedEntity;
import jakarta.persistence.Entity;

@Entity
public class Rating extends TimestampedEntity {

    private String userId;
    private int score;

    public Rating(String userId, int score) {
        this.userId = userId;
        this.score = score;
    }

    public Rating() {
    }

    public String getUserId() {
        return userId;
    }
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }


}