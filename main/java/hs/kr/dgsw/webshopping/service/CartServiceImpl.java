package hs.kr.dgsw.webshopping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hs.kr.dgsw.webshopping.domain.Cart;
import hs.kr.dgsw.webshopping.domain.CartMapper;

@Service
public class CartServiceImpl implements CartService{
    @Autowired
    CartMapper cartMapper;

	@Override
	public Long add(Cart cart) {
		return cartMapper.add(cart);
	}

	@Override
	public int deleteById(Long id) {
		return cartMapper.deleteById(id);
	}

	@Override
	public int deleteByUserId(Long userid) {
		return cartMapper.deleteByUserId(userid);
	}

	@Override
	public Cart findById(Long id) {
		return cartMapper.findById(id);
	}

	@Override
	public List<Cart> findByUserId(Long userid) {
		return cartMapper.findByUserId(userid);
	}

}