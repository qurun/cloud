package com.qf.cloud.provider.controller;

import com.qf.cloud.provider.service.intf.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @Autowired
    private OrderService service;
}
