package hs.kr.dgsw.webshopping.service;

import java.util.List;

import hs.kr.dgsw.webshopping.domain.Menu;

public interface MenuService {
    List<Menu> findAll();
    Menu findById(Long id);

}