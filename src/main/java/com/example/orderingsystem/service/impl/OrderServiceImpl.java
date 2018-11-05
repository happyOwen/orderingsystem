package com.example.orderingsystem.service.impl;

import com.example.orderingsystem.controller.convert.OrderForm2OrderDTO;
import com.example.orderingsystem.dto.OrderDTO;
import com.example.orderingsystem.dto.OrderDetail;
import com.example.orderingsystem.form.OrderForm;
import com.example.orderingsystem.service.OrderService;

import java.math.BigDecimal;
import java.math.BigInteger;

public class OrderServiceImpl implements OrderService {
    @Override
    public void create(OrderForm orderForm) {
        //转换成DTO
        OrderDTO orderDTO = OrderForm2OrderDTO.convert(orderForm);
        BigDecimal resultAmount = new BigDecimal(BigInteger.ZERO);
        for(OrderDetail orderDetail: orderDTO.getList()) {

        }
    }
}
