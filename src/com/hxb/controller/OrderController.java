package com.hxb.controller;

import com.hxb.po.Order;
import com.hxb.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
public class OrderController {
    public OrderController() {
    }
    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "/findAllOrder",method = RequestMethod.POST)
    public Order findAllOrder(){
        System.out.println(1);
        Order order= this.orderService.findAllOrder();
        System.out.println(order);
        if (order!=null){
            System.out.println("查询成功");
            return order;
        }
        System.out.println("查询失败 ");
        return null;
    }


}
