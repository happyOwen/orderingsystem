package com.example.orderingsystem.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class SellerInfoVO {

	@JsonProperty("storeName")
	private String storeName;

	@JsonProperty("storeImage")
	private String storeImage;

	@JsonProperty("notice")
	private String notice;

}
