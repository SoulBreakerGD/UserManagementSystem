package com.funnycode.usermanagementsystem.service;

import com.funnycode.usermanagementsystem.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface IUserService {
    User createUser(User user);
}
