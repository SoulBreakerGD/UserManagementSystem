package com.funnycode.usermanagementsystem.service.impl;

import com.funnycode.usermanagementsystem.repository.IUserRepository;
import com.funnycode.usermanagementsystem.entity.User;
import com.funnycode.usermanagementsystem.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService implements IUserService {

    private final IUserRepository iUserRepository;

    @Override
    public User createUser(User user) {
        return iUserRepository.save(user);
    }
}
