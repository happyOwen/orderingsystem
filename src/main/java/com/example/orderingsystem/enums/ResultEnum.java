package com.example.orderingsystem.enums;

import lombok.Getter;

@Getter
public enum ResultEnum {
    CONVERT_ERROR(900,"转换错误");
    private Integer code;
    private String message;
    ResultEnum(Integer code,String message) {
        this.code = code;
        this.message = message;
    }
}
