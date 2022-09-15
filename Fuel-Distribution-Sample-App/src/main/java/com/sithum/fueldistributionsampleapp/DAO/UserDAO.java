package com.sithum.fueldistributionsampleapp.DAO;

import com.sithum.fueldistributionsampleapp.JWT.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO extends CrudRepository<User, Integer> {
}
