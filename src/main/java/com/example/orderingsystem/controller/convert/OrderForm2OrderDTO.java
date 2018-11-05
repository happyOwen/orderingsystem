package com.example.orderingsystem.controller.convert;

import com.example.orderingsystem.dto.OrderDTO;
import com.example.orderingsystem.dto.OrderDetail;
import com.example.orderingsystem.enums.ResultEnum;
import com.example.orderingsystem.exception.SellException;
import com.example.orderingsystem.form.OrderForm;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class OrderForm2OrderDTO {
    public static OrderDTO convert(OrderForm orderForm) {
        Gson gson = new Gson();
        OrderDTO orderDTO = new OrderDTO();

        List<OrderDetail> list ;
        try {
            list = gson.fromJson(orderForm.getItems(),new TypeToken<List<OrderDetail>>(){}.getType());
        }catch (Exception e) {
            log.error("对象转换出错");
            throw new SellException(ResultEnum.CONVERT_ERROR);
        }

        orderDTO.setBuyerAddress(orderForm.getAddress());
        orderDTO.setBuyerPhone(orderForm.getPhone());
        orderDTO.setBuyName(orderForm.getName());
        orderDTO.setBuyerOpenid(orderForm.getOpenid());
        orderDTO.setList(list);
        return orderDTO;
    }
}
