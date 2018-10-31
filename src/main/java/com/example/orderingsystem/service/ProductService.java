package com.example.orderingsystem.service;

import com.example.orderingsystem.entity.ProductInfo;

import java.util.List;

public interface ProductService {

	ProductInfo findOne(Long productId);

	List<ProductInfo> findUpAll();

	List<ProductInfo> findAll();

	ProductInfo save(ProductInfo productInfo);

//	void increaseStock(List<CartDTO> cartDTOList);
//
//	void decreaseStock(List<CartDTO> cartDTOList);
}
