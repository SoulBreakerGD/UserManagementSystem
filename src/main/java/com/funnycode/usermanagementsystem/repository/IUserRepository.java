package com.funnycode.usermanagementsystem.repository;

import com.funnycode.usermanagementsystem.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Integer> {

}
