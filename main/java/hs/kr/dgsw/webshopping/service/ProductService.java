package hs.kr.dgsw.webshopping.service;

import java.util.List;

import hs.kr.dgsw.webshopping.domain.Product;

public interface ProductService {
    List<Product> findAll();
    int deleteById(Long id);
    Long add(Product product);
    int modify(Product product);
    Product findById(Long id);
    List<Product> findByMenuId(Long menuid);
    List<Product> findBySubMenId(Long submenuid);
}