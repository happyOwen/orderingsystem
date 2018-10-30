package com.example.orderingsystem.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class ProductCategory {
    @Id
    private Integer categoryId;

    private Long sellerId;

    private String categoryName;

    private Integer categoryType;

    private Date createTime;

    private Date updateTime;
}
