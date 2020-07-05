package hs.kr.dgsw.webshopping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hs.kr.dgsw.webshopping.domain.SubMenu;
import hs.kr.dgsw.webshopping.domain.SubMenuMapper;

@Service
public class SubMenuServiceImpl implements SubMenuService{
    @Autowired
    SubMenuMapper subMenuMapper;

    @Override
    public List<SubMenu> findByMenuId(Long menuid){
        return subMenuMapper.findByMenuId(menuid);
    }

    @Override
    public SubMenu findById(Long id){
        return subMenuMapper.findById(id);
    }
}