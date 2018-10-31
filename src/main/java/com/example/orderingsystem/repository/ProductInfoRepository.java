package com.example.orderingsystem.repository;

import com.example.orderingsystem.entity.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductInfoRepository extends JpaRepository<ProductInfo, Long> {

	List<ProductInfo> findByProductStatus(Integer productStatus);
}
