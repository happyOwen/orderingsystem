package com.example.orderingsystem.entity;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
@DynamicUpdate
public class SellerInfo {

	@Id
	private Long sellerId;

	private String username;

	private String password;

	private String phone;	//手机

	private String sellerName;	//姓名

	private String storeName;	//门店名

	private String position;	//店铺位置

	private String openid;	//微信openid

	private Integer sellerStatus;	//0为审核中,-1为违规店铺,1为上线店铺,2为已关闭店铺

	private String businessLincence;	//营业执照

	private String idcard;	//身份证

	private Date createTime;	//创建时间

	private Date updateTime;	//修改时间

	private String notice;	//商家公告

	private String storeImage;  //商家图片
}
