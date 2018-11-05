package com.example.orderingsystem.exception;

import com.example.orderingsystem.enums.OrderStatusEnum;
import lombok.Data;

@Data
public class OrderException extends RuntimeException {

    private Integer code;
    public OrderException(Integer code,String message) {
        super(message);
        this.code = code;
    }
    public OrderException(OrderStatusEnum orderStatusEnum) {
        super(orderStatusEnum.getMessage());
        this.code = orderStatusEnum.getCode();
    }
}
