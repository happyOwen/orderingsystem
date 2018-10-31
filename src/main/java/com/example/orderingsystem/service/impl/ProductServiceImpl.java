package com.example.orderingsystem.service.impl;

import com.example.orderingsystem.entity.ProductInfo;
import com.example.orderingsystem.enums.ProductStatusEnum;
import com.example.orderingsystem.repository.ProductInfoRepository;
import com.example.orderingsystem.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductInfoRepository repository;

	@Override
	public ProductInfo findOne(Long productId) {
		return repository.findById(productId).orElse(null);
	}

	@Override
	public List<ProductInfo> findUpAll() {
		return repository.findByProductStatus(ProductStatusEnum.UP.getCode());
	}

	@Override
	public List<ProductInfo> findAll() {
		return repository.findAll();
	}

	@Override
	public ProductInfo save(ProductInfo productInfo) {
		return repository.save(productInfo);
	}
}
