package org.example.bookreview.services;

import org.example.bookreview.model.Review;
import org.example.bookreview.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ReviewService {
@Autowired
private ReviewRepository reviewRepository;

public List<Review> getAllReviews(){
    return reviewRepository.findAll();
}


}
