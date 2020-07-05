package hs.kr.dgsw.webshopping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hs.kr.dgsw.webshopping.domain.Product;
import hs.kr.dgsw.webshopping.domain.ProductMapper;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    ProductMapper productMapper;

	@Override
	public List<Product> findAll() {
		return productMapper.findAll();
	}

	@Override
	public int deleteById(Long id) {
		return productMapper.deleteById(id);
	}

	@Override
	public Long add(Product product) {
		return productMapper.add(product);
	}

	@Override
	public int modify(Product product) {
		return productMapper.modify(product);
	}

	@Override
	public Product findById(Long id) {
		return productMapper.findById(id);
	}

	@Override
	public List<Product> findByMenuId(Long menuid) {
		return productMapper.findByMenuId(menuid);
	}

	@Override
	public List<Product> findBySubMenId(Long submenuid) {
		return productMapper.findBySubMenu(submenuid);
	}
    
}