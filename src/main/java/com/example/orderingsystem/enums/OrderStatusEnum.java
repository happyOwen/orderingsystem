package com.example.orderingsystem.enums;

import lombok.Getter;

@Getter
public enum OrderStatusEnum {
    CREATE_ERROR(800,"创建订单异常");
    private Integer code;
    private String message;

    OrderStatusEnum(Integer code,String message) {
        this.message = message;
        this.code = code;
    }
}
