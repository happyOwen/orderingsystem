package com.example.orderingsystem.service;

import com.example.orderingsystem.entity.SellerInfo;
import org.springframework.stereotype.Service;

public interface SellerService {

	SellerInfo findOne(Integer sellerId);

	SellerInfo save(SellerInfo sellerInfo);
}
