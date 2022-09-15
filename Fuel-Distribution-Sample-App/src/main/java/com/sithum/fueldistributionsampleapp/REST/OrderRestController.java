package com.sithum.fueldistributionsampleapp.REST;

import com.sithum.fueldistributionsampleapp.Service.OrderService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class OrderRestController {


  private OrderService orderService;

  public OrderRestController(OrderService orderService) {
    this.orderService = orderService;
  }
}
