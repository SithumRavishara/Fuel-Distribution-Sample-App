package com.sithum.fueldistributionsampleapp.Service;

import com.sithum.fueldistributionsampleapp.Entity.Order;

import java.util.List;

public interface OrderService {

  public Order findById(int theId);

  public void save(Order theOrder);

  public  void deleteById(int theId);

  public List<Order> findByType(String type);
}
