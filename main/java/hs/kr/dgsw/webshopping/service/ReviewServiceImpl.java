package hs.kr.dgsw.webshopping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hs.kr.dgsw.webshopping.domain.Review;
import hs.kr.dgsw.webshopping.domain.ReviewMapper;

@Service
public class ReviewServiceImpl implements ReviewService{
    @Autowired
    ReviewMapper reviewMapper;

	@Override
	public Long add(Review review) {
		return reviewMapper.add(review);
	}

	@Override
	public int deleteById(Long id) {
		return reviewMapper.deleteById(id);
	}

	@Override
	public List<Review> findByProductId(Long productid) {
		return reviewMapper.findByProductId(productid);
	}

	@Override
	public int modify(Review review) {
		return reviewMapper.modify(review);
	}
}