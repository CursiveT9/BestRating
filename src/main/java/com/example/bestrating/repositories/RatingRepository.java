package com.example.bestrating.repositories;

import com.example.bestrating.models.entities.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RatingRepository extends JpaRepository<Rating, Long> {
    Rating findByUserId(String userId);
}