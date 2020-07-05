package hs.kr.dgsw.webshopping.controller;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import hs.kr.dgsw.webshopping.domain.Cart;
import hs.kr.dgsw.webshopping.service.CartService;

@RestController
public class CartController {
    @Autowired
    CartService cartService;

    @PostMapping(value = "/api/cart")
    public long add(@RequestBody Cart cart){
        return cartService.add(cart);
    }

    @DeleteMapping(value = "/api/cart/id")
    public int deleteById(@Param("id") Long id){
        return cartService.deleteById(id);
    }

    @DeleteMapping(value = "/api/cart/userid")
    public int deleteByUserId(@Param("userid") Long userid){
        return cartService.deleteByUserId(userid);
    }

    @GetMapping(value = "/api/cart/id")
    public Cart findById(@Param("id") Long id){
        return cartService.findById(id);
    }

    @GetMapping(value = "/api/cart/userid")
    public List<Cart> findByUserId(@Param("userid") Long userid){
        return cartService.findByUserId(userid);
    }
}