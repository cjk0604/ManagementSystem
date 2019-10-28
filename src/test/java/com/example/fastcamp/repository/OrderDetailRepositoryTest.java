package com.example.fastcamp.repository;

import com.example.fastcamp.FastcallApplicationTests;
import com.example.fastcamp.controller.repository.OrderDetailRepository;
import com.example.fastcamp.model.entity.OrderDetail;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;

public class OrderDetailRepositoryTest extends FastcallApplicationTests {

    @Autowired
    private OrderDetailRepository orderDetailRepository;

    @Test
    public void create(){
        OrderDetail orderDetail = new OrderDetail();

        orderDetail.setOrderAt(LocalDateTime.now());

        // User
//        orderDetail.setUserId(7L);

        // Item
//        orderDetail.setItemId(1L);

        OrderDetail newOrderDetail =  orderDetailRepository.save(orderDetail);
        Assert.assertNotNull(newOrderDetail);

    }
}
