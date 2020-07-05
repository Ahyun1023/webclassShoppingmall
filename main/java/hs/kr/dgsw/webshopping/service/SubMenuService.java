package hs.kr.dgsw.webshopping.service;
import java.util.List;

import hs.kr.dgsw.webshopping.domain.SubMenu;

public interface SubMenuService {
    List<SubMenu> findByMenuId(Long menuid);
    SubMenu findById(Long id);
}