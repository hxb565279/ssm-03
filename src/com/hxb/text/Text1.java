package com.hxb.text;

import com.hxb.controller.OrderController;
import com.hxb.po.Order;
import com.hxb.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;

public class Text1 {
    @Autowired
private static OrderService orderService;
    public static void main(String[] args) {
        Order allOrder = orderService.findAllOrder();
        System.out.println(allOrder.toString());

    }
}
