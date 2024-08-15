package org.example.bookreview.services;

import org.example.bookreview.model.Review;
import org.example.bookreview.repository.ReviewRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.SequencedCollection;

@Service
public class ReviewService {

private ReviewRepository reviewRepository;

public List<Review> getAllReviews(){
    return reviewRepository.findAll();
}


}
