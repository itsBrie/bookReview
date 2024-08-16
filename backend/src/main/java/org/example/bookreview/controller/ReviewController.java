package org.example.bookreview.controller;

import org.example.bookreview.model.Review;
import org.example.bookreview.services.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
public class ReviewController {
    @Autowired
    private  ReviewService reviewService;




    @GetMapping("/reviews")
    public List<Review> returnAllReviews(){
        return reviewService.getAllReviews();
    }
}
