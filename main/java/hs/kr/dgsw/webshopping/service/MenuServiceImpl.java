package hs.kr.dgsw.webshopping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hs.kr.dgsw.webshopping.domain.Menu;
import hs.kr.dgsw.webshopping.domain.MenuMapper;

@Service
public class MenuServiceImpl implements MenuService{
    @Autowired
    MenuMapper menuMapper;

    @Override
    public List<Menu> findAll(){
        return menuMapper.findall();
    }

	@Override
	public Menu findById(Long id) {
		return menuMapper.findById(id);
	}
    
}