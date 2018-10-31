package com.example.orderingsystem.controller;

import com.example.orderingsystem.VO.ProductInfoVO;
import com.example.orderingsystem.VO.ProductVO;
import com.example.orderingsystem.VO.ResultVO;
import com.example.orderingsystem.entity.ProductCategory;
import com.example.orderingsystem.entity.ProductInfo;
import com.example.orderingsystem.service.CategoryService;
import com.example.orderingsystem.service.ProductService;
import com.example.orderingsystem.utils.ResultVOUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/sell/buyer/product")
public class BuyerProductController {

	@Autowired
	private ProductService productService;

	@Autowired
	private CategoryService categoryService;

	@GetMapping("/list")
	public ResultVO list(){
		//1.查询所有上架商品
		List<ProductInfo> productInfoList = productService.findUpAll();

		//2.根据上架商品查询相关类目
		List<Integer> categoryTypeList = productInfoList.stream().map(e -> e.getCategoryType()).collect(Collectors.toList());
		List<ProductCategory> productCategoryList = categoryService.findByCategoryTypeIn(categoryTypeList);

		//3.数据拼装
		List<ProductVO> productVOList = new ArrayList<>();
		for(ProductCategory productCategory : productCategoryList){
			ProductVO productVO = new ProductVO();
			productVO.setCategoryName(productCategory.getCategoryName());
			productVO.setCategoryType(productCategory.getCategoryType());

			List<ProductInfoVO> productInfoVOList = new ArrayList<>();
			for(ProductInfo productInfo : productInfoList){
				if(productInfo.getCategoryType().equals(productCategory.getCategoryType())){
					ProductInfoVO productInfoVO = new ProductInfoVO();
					BeanUtils.copyProperties(productInfo, productInfoVO);
					productInfoVOList.add(productInfoVO);
				}
			}
			productVO.setProductInfoVOList(productInfoVOList);
			productVOList.add(productVO);
		}
		return ResultVOUtil.success(productVOList);
	}
}
