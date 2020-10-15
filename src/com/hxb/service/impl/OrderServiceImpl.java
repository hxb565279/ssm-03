package com.hxb.service.impl;

import com.hxb.dao.OrderDao;
import com.hxb.po.Order;
import com.hxb.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("orderService")
@Transactional
public class OrderServiceImpl implements OrderService {
   @Autowired
   private OrderDao orderDao;
    @Override
    public Order findAllOrder() {
        return this.orderDao.findAllOrder();
    }
}
