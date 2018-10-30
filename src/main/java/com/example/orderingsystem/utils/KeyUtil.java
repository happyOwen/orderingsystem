package com.example.orderingsystem.utils;

import java.util.Random;

public class KeyUtil {
    private static Random random = new Random();
    public static String createOrderId() {
       long temp1 =  System.currentTimeMillis();
       int temp2 = random.nextInt(90000)+10000;
       return ""+temp1+temp2;
    }
}
