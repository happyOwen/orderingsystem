package com.example.orderingsystem.controller;

import com.example.orderingsystem.VO.ResultVO;
import com.example.orderingsystem.VO.SellerInfoVO;
import com.example.orderingsystem.entity.SellerInfo;
import com.example.orderingsystem.service.SellerService;
import com.example.orderingsystem.utils.ResultVOUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SellerController {

	@Autowired
	private SellerService sellerService;

	@GetMapping("/seller")
	public ResultVO seller(@RequestParam(value = "sellerId", defaultValue = "123456L") Long sellerId){
		SellerInfo sellerInfo = sellerService.findOne(sellerId);
		SellerInfoVO sellerInfoVO = new SellerInfoVO();
		BeanUtils.copyProperties(sellerInfo, sellerInfoVO);
		return ResultVOUtil.success(sellerInfoVO);
	}

	@GetMapping("/test")
	public String test(@RequestParam(value = "sellerId", defaultValue = "123456L") Long sellerId){
		SellerInfo sellerInfo = sellerService.findOne(sellerId);

		return sellerInfo.getSellerName();
	}
}
