package com.sk.repositoty;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sk.entity.User;

public interface IUserRepository extends JpaRepository<User, Integer> {

}
