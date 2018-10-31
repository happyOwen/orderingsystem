package com.example.orderingsystem.repository;

import com.example.orderingsystem.entity.ProductCategory;
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
public class ProductInfoRepositoryTest {

	@Autowired
	private ProductInfoRepository repository;

	@Test
	public void save(){
		ProductInfo productInfo = new ProductInfo();
		productInfo.setProductId(132123132132L);
		productInfo.setSellerId(123456L);
		productInfo.setProductName("铁板鸡扒饭");
		productInfo.setProductPrice(new BigDecimal(20.00));
		productInfo.setProductStock(100);
		productInfo.setProductDescription("好吃的鸡扒饭");
		productInfo.setProductLabel("not known");
		productInfo.setProductIcon("http://xxx.com");
		productInfo.setProductStatus(0);
		productInfo.setCategoryType(3);
		productInfo.setMonthlySale(255);
		productInfo.setProductSpec("大");
		ProductInfo result = repository.save(productInfo);
		Assert.assertNotNull(result);
	}

	@Test
	public void findByProductStatus() {
		List<ProductInfo> productInfoList = repository.findByProductStatus(0);
		Assert.assertNotEquals(0, productInfoList.size());
	}
}