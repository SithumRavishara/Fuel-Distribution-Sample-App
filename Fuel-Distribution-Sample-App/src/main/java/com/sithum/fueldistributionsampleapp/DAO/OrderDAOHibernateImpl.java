package com.sithum.fueldistributionsampleapp.DAO;

import com.sithum.fueldistributionsampleapp.Entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class OrderDAOHibernateImpl implements OrderDAO{

  private EntityManager entityManager;

  @Autowired
  public OrderDAOHibernateImpl(EntityManager theEntityManager) {
    entityManager =  theEntityManager;
  }

  @Override
  public Order findById(int theId) {
    return null;
  }

  @Override
  public void save(Order theOrder) {

  }

  @Override
  public void deleteById(int theId) {

  }

  @Override
  public List<Order> findByType(String type) {
    return null;
  }
}
