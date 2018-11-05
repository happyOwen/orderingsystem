package com.example.orderingsystem.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
public class OrderDTO {
    private Long orderId;
    public Long sellerId;

    private String buyName;
    private String buyerPhone;
    private String buyerAddress;
    private String buyerOpenid;

    private Integer orderStatus;
    private Integer payStatus;
    private BigDecimal orderAmount;

    private List<OrderDetail> list;
    public Date createTime;
    public Date updateTime;
}
