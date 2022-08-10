package com.sithum.FuelDistributionSampleApp.Service;

import com.sithum.FuelDistributionSampleApp.DAO.OrderDAO;
import com.sithum.FuelDistributionSampleApp.Entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class OrderServiceIml implements OrderService{

  private OrderDAO orderDAO;

  @Autowired
  public OrderServiceIml(OrderDAO theOrderDAO) {
    orderDAO = theOrderDAO;
  }

  @Override
  @Transactional
  public Order findById(int theId) {
    return null;
  }

  @Override
  @Transactional
  public void save(Order theOrder) {

  }

  @Override
  @Transactional
  public void deleteById(int theId) {

  }

  @Override
  @Transactional
  public List<Order> findByType(String type) {
    return null;
  }
}
