package com.example.orderingsystem.controller;

import com.example.orderingsystem.VO.ResultVO;
import com.example.orderingsystem.enums.OrderStatusEnum;
import com.example.orderingsystem.exception.OrderException;
import com.example.orderingsystem.form.OrderForm;
import com.example.orderingsystem.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * 订单相关controller
 */

@RestController
@RequestMapping("/buyer/order")
@Slf4j
public class OrderController {

    @Autowired
    private OrderService orderService;

    /**
     * 创建订单
     * @return
     */
    @PostMapping("/create")
    public ResultVO create(@Valid OrderForm orderForm, BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            log.error("创建订单出现异常");
            throw new OrderException(OrderStatusEnum.CREATE_ERROR.getCode(),bindingResult.getFieldError().getDefaultMessage());
        }
        orderService.create(orderForm);
        return null;
    }
}
