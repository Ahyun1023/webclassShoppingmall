package hs.kr.dgsw.webshopping.domain;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ProductMapper {
    Long add(Product product);
    int modify(Product product);
    int deleteById(@Param("id") Long id);
    Product findById(@Param("id") Long id);
    List<Product> findByMenuId(@Param("menuid") Long menuid);
    List<Product> findBySubMenu(@Param("submenuid") Long submenuid);
    List<Product> findAll();
}