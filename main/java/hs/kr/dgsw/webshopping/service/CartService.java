package hs.kr.dgsw.webshopping.service;

import java.util.List;

import hs.kr.dgsw.webshopping.domain.Cart;

public interface CartService {
    Long add(Cart cart);
    int deleteById(Long id);
    int deleteByUserId(Long userid);
    Cart findById(Long id);
    List<Cart> findByUserId(Long userid);
}