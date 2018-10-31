package com.example.orderingsystem.repository;

import com.example.orderingsystem.entity.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.Id;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

	@Autowired
	private ProductCategoryRepository repository;

	@Test
	public void saveTest(){
		ProductCategory productCategory = new ProductCategory(123456L, "男生最爱", 1);
		ProductCategory result = repository.save(productCategory);
		Assert.assertNotNull(result);
	}

	@Test
	public void findOneTest(){
		ProductCategory productCategory = repository.findById(1).orElse(null);
		Assert.assertNotNull(productCategory);
	}

	@Test
	public void findByCategoryTypeInTest(){
		List<Integer> list = Arrays.asList(1, 2);
		List<ProductCategory> result = repository.findByCategoryTypeIn(list);
		Assert.assertNotEquals(0, result.size());
	}
}