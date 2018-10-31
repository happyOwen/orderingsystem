package com.example.orderingsystem.entity;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@DynamicUpdate
public class ProductInfo {

	@Id
	private Long productId;

	private Long sellerId;

	private String productName;

	private BigDecimal productPrice; //单价

	private Integer productStock;	//库存

	private String productDescription;	//描述

	private String productLabel;	//标签	varchar

	private String productIcon;	//小图	varchar

	private Integer productStatus;	//商品状态,0上架，1下架	tinyint	3	0

	private Integer categoryType;	//类目编号	int	11

	private Integer monthlySale;	//月销量	int	255	0

	private Date createTime;	//创建时间

	private Date updateTime;	//修改时间

	private String productSpec;  //规格
}
