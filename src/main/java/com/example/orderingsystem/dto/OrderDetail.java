package com.example.orderingsystem.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class OrderDetail {
    private Long productId;
    private Long orderId;
    private String productName;
    private String productIcon;
    private BigDecimal productPrice;
    private Integer productQuantity;
    private String productLabel;
    private String productSpec;
    private Date createTime;
    private Date updateTime;
}
