package com.example.orderingsystem.service.impl;

import com.example.orderingsystem.entity.SellerInfo;
import com.example.orderingsystem.repository.SellerInfoRepository;
import com.example.orderingsystem.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerServiceImpl implements SellerService {

	@Autowired
	private SellerInfoRepository repository;

	@Override
	public SellerInfo findOne(Integer sellerId) {
		return repository.findById(sellerId).orElse(null);
	}

	@Override
	public SellerInfo save(SellerInfo sellerInfo) {
		return repository.save(sellerInfo);
	}
}
