package com.example.orderingsystem.entity;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
@DynamicUpdate
public class ProductCategory {
    @Id
    @GeneratedValue
    private Integer categoryId;

    private Long sellerId;

    private String categoryName;

    private Integer categoryType;

    private Date createTime;

    private Date updateTime;

    public ProductCategory(Long sellerId, String categoryName, Integer categoryType) {
        this.sellerId = sellerId;
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }
}
