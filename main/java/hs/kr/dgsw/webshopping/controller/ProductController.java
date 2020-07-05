package hs.kr.dgsw.webshopping.controller;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import hs.kr.dgsw.webshopping.domain.Product;
import hs.kr.dgsw.webshopping.service.ProductService;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping(value = "/api/product")
    public List<Product> findAll(){
        return productService.findAll();
    }

    @GetMapping(value = "/api/product/id")
    public Product findById(@Param("id") Long id){
        return productService.findById(id);
    }

    @GetMapping(value = "/api/product/menuid")
    public List<Product> findByMenuId(@Param("menuid") Long menuid){
        return productService.findByMenuId(menuid);
    }

    @GetMapping(value = "/api/product/submenuid")
    public List<Product> findBySubMenuId(@Param("submenuid") Long submenuid){
        return productService.findBySubMenId(submenuid);
    }

    @PostMapping(value = "/api/product")
    public Long add(@RequestBody Product product){
        return productService.add(product);
    }

    @PutMapping(value = "/api/product")
    public int modify(@RequestBody Product product){
        return productService.modify(product);
    }

    @DeleteMapping(value = "/api/product")
    public int deleteById(@Param("id") Long id){
        return productService.deleteById(id);
    }
}