package hs.kr.dgsw.webshopping.controller;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import hs.kr.dgsw.webshopping.domain.SubMenu;
import hs.kr.dgsw.webshopping.service.SubMenuService;

@RestController
public class SubMenuController {
    @Autowired
    SubMenuService subMenuService;

    @GetMapping(value = "/api/subMenu/menu")
    public List<SubMenu> findByMenuId(@Param("menuid") Long menuid){
        return subMenuService.findByMenuId(menuid);
    }

    @GetMapping(value = "/api/subMenu/id")
    public SubMenu findById(@Param("id") Long id){
        return subMenuService.findById(id);
    }
}