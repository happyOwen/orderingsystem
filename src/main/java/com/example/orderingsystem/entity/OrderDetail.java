package com.example.orderingsystem.entity;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
@DynamicUpdate
public class OrderDetail {
    @Id
    @GeneratedValue
    private Integer id;

    private Long productId;
    private Long orderId;
    private String productName;
    private BigDecimal productPrice;
    private Integer productQuantity;
    private String productIcon;
    private String productLabel;
    private String productSpec;
    private Date createTime;
    private Date updateTime;
}
