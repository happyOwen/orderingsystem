package com.example.orderingsystem.repository;

import com.example.orderingsystem.entity.SellerInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SellerInfoRepositoryTest {

	@Autowired
	private SellerInfoRepository repository;

	@Test
	public void saveTest(){
		SellerInfo sellerInfo = new SellerInfo();
		sellerInfo.setSellerId(123456);
		sellerInfo.setUsername("老王");
		sellerInfo.setPassword("123456");
		sellerInfo.setPhone("12345678910");
		sellerInfo.setSellerName("王老吉");
		sellerInfo.setStoreName("回味大酒店");
		sellerInfo.setPosition("南亭街角");
		sellerInfo.setOpenid("wechatNum");
		sellerInfo.setSellerStatus(1);
		sellerInfo.setBusinessLincence("110108001445941");	//营业执照
		sellerInfo.setIdcard("123456789123456789");	//身份证
		sellerInfo.setStoreImage("http://xxxStore.com");

		SellerInfo result = repository.save(sellerInfo);
		Assert.assertNotNull(result);
	}

	@Test
	public void findBySellIdTest(){
		SellerInfo sellerInfo = repository.findById(123456).orElse(null);
		System.out.println(sellerInfo.getSellerName());
		Assert.assertNotNull(sellerInfo);
	}
}