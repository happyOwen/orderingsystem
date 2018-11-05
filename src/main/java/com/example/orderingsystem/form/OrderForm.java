package com.example.orderingsystem.form;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class OrderForm {
    private String name ="未填";

    private String address = "未填";

    private String phone = "未填";

    @NotEmpty(message = "openid为必填字段")
    private String openid;

    @NotEmpty(message = "items为必填字段")
    private String items;
}
