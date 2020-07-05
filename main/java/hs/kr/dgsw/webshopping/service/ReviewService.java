package hs.kr.dgsw.webshopping.service;

import java.util.List;

import hs.kr.dgsw.webshopping.domain.Review;

public interface ReviewService {
    Long add(Review review);
    int deleteById(Long id);
    int modify(Review review);
    List<Review> findByProductId(Long productid);
}