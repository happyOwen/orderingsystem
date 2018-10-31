package com.example.orderingsystem.service.impl;

import com.example.orderingsystem.entity.SellerInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SellerServiceImplTest {

	@Autowired
	private SellerServiceImpl sellerService;

	@Test
	public void saveTest(){
		SellerInfo sellerInfo = new SellerInfo();
		sellerInfo.setSellerId(123456L);
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

		SellerInfo result = sellerService.save(sellerInfo);
		Assert.assertEquals(new Long(123456L), result.getSellerId());
	}

	@Test
	public void findOne() {
		SellerInfo sellerInfo = sellerService.findOne(123456L);
		Assert.assertEquals(new Long(123456L), sellerInfo.getSellerId());
	}


}