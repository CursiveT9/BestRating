package com.example.bestrating.repositories;

import com.example.bestrating.models.entities.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RatingRepository extends JpaRepository<Rating, String> {
    Rating findByUserId(String userId);
    List<Rating> findAllByOrderByPointsDesc();
}