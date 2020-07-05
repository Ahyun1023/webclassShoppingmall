package hs.kr.dgsw.webshopping.domain;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SubMenuMapper {
    List<SubMenu> findByMenuId(Long menuId);
    SubMenu findById(@Param("id") Long id);
}