package com.sithum.fueldistributionsampleapp.JWT.dao;

import com.sithum.fueldistributionsampleapp.JWT.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO extends CrudRepository<User, Integer> {
  User findByUsername(String username);
}
