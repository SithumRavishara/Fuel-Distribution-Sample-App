package com.sithum.fueldistributionsampleapp.DAO;

import com.sithum.fueldistributionsampleapp.Entity.Order;

import java.util.List;

public interface OrderDAO {

  public Order findById(int theId);

  public void save(Order theOrder);

  public  void deleteById(int theId);

  public List<Order> findByType(String type);
}
