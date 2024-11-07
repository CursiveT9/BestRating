package com.example.bestrating.models.entities;

import com.example.bestrating.models.baseEntities.BaseEntity;
import jakarta.persistence.*;

@Entity
@Table(name = "user_rating")
public class Rating extends BaseEntity {

    @Column(name = "user_id", nullable = false)
    private String userId; // ID пользователя, уникальный идентификатор

    @Column(name = "points", nullable = false)
    private int points; // Очки пользователя, используемые для рейтинга

    @Transient // Поле не сохраняется в базе данных, можно вычислять по необходимости
    private int rank; // Место в рейтинге (если требуется)

    public Rating() {
    }

    public Rating(String userId, int points) {
        this.userId = userId;
        this.points = points;
    }

    // Getters и Setters

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "UserRating{" +
                "userId='" + userId + '\'' +
                ", points=" + points +
                ", rank=" + rank +
                '}';
    }
}
