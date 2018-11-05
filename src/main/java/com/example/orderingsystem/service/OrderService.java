package com.example.orderingsystem.service;

import com.example.orderingsystem.form.OrderForm;
import org.springframework.stereotype.Service;

@Service
public interface OrderService {
    void create(OrderForm orderForm);
}
