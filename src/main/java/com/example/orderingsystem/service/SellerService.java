package com.example.orderingsystem.service;

import com.example.orderingsystem.entity.SellerInfo;

public interface SellerService {

	SellerInfo findOne(Long sellerId);

	SellerInfo save(SellerInfo sellerInfo);
}
