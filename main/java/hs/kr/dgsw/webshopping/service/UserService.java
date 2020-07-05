package hs.kr.dgsw.webshopping.service;

import java.util.List;

import hs.kr.dgsw.webshopping.domain.User;

public interface UserService {
    List<User> findAll();
    User findById(Long id);
    User findByAccount(String account);
    int deleteById(Long id);
    Long add(User user);
    int modify(User user);
    User login(User user);
}