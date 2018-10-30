package com.example.orderingsystem.enums;

public enum SellerStatusEnum {

	//0为审核中,-1为违规店铺,1为上线店铺,2为已关闭店铺
	ILLEGAL(-1, "违规店铺"),

	VERIFYING(0, "审核中"),

	OPENED(1, "上线店铺"),

	CLOSED(2, "关闭店铺")
	;

	private Integer code;

	private String message;

	SellerStatusEnum(Integer code, String message) {
		this.code = code;
		this.message = message;
	}
}
