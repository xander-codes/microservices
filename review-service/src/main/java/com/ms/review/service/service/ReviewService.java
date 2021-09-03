package com.ms.review.service.service;

import com.ms.review.service.model.Review;
import com.ms.review.service.repository.ReviewRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ReviewService {

    private final ReviewRepository reviewRepository;

    public List<Review> getAllReviews() {
        return reviewRepository.findAll();
    }

    public Review getReviewById(Long reviewId) {
        return reviewRepository.findById(reviewId).get();
    }

    public List<Review> getAllReviewsByProductId(Long postId) {
        return reviewRepository.findAllByProductId(postId);
    }

    public List<Review> getReviewsByUserId(Long userId) {
        return reviewRepository.findAllByUserId(userId);
    }

    public void addReview(Review review) {
        reviewRepository.save(review);
    }

    public void deleteReview(Long reviewId) {
        reviewRepository.deleteById(reviewId);
    }

}
