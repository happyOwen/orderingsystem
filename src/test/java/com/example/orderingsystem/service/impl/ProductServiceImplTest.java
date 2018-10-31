package com.example.orderingsystem.service.impl;

import com.example.orderingsystem.entity.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceImplTest {

	@Autowired
	private ProductServiceImpl productService;

	@Test
	public void findOne() {
		ProductInfo productInfo = productService.findOne(132123132132L);
		Assert.assertNotNull(productInfo);
	}

	@Test
	public void findUpAll() {
		List<ProductInfo> productInfoList = productService.findUpAll();
		Assert.assertNotEquals(0, productInfoList.size());
	}

	@Test
	public void findAll() {
		List<ProductInfo> productInfoList = productService.findAll();
		Assert.assertNotEquals(0, productInfoList.size());
	}

	@Test
	public void save() {
		ProductInfo productInfo = new ProductInfo();
		productInfo.setProductId(13564654654652L);
		productInfo.setSellerId(123456L);
		productInfo.setProductName("宫保鸡丁饭");
		productInfo.setProductPrice(new BigDecimal(25.00));
		productInfo.setProductStock(200);
		productInfo.setProductDescription("好吃的宫保鸡丁饭");
		productInfo.setProductLabel("微辣");
		productInfo.setProductIcon("http://xxx.com");
		productInfo.setProductStatus(0);
		productInfo.setCategoryType(3);
		productInfo.setMonthlySale(300);
		productInfo.setProductSpec("大");
		ProductInfo result = productService.save(productInfo);
		Assert.assertNotNull(result);
	}
}