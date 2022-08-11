package com.SpringSecur.Demo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringSecur.Demo.Entity.User;

@Repository
public interface UserRepo extends JpaRepository<User,Integer>{

}
