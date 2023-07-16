package com.funnycode.usermanagementsystem;

import org.springframework.stereotype.Service;

@Service
public interface IUserService {
    User createUser(User user);
}
