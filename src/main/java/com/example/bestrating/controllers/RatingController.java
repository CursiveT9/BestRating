package com.example.bestrating.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class RatingController {
    @GetMapping("/rating")
    public String getAllUserRatings(Model model) {
        // Логика обработки рейтинга
        System.out.println("sas2");
        return "ratingsList";  // Шаблон HTML
    }
}

