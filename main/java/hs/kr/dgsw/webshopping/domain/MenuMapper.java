package hs.kr.dgsw.webshopping.domain;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MenuMapper {
    List<Menu> findall();
    Menu findById(Long id);
}