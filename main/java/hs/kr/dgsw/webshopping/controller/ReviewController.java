package hs.kr.dgsw.webshopping.controller;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import hs.kr.dgsw.webshopping.domain.Review;
import hs.kr.dgsw.webshopping.service.ReviewService;

@RestController
public class ReviewController {
    @Autowired
    ReviewService reviewService;

    @PostMapping(value = "/api/review")
    public Long add(@RequestBody Review review){
        return reviewService.add(review);
    }

    @DeleteMapping(value="/api/review")
    public int deleteById(@RequestBody Long id){
        return reviewService.deleteById(id);
    }

    @GetMapping(value = "/api/review/productid")
    public List<Review> findByProductId(@Param("productid") Long productid){
        return reviewService.findByProductId(productid);
    }

    @PutMapping(value = "/api/review")
    public int modify(@RequestBody Review review){
        return reviewService.modify(review);
    }
}