package com.example.orderingsystem.exception;

import com.example.orderingsystem.enums.ResultEnum;

public class SellException extends RuntimeException {
    private Integer code;
    public SellException(Integer code,String message) {
        super(message);
        this.code = code;
    }
    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}
