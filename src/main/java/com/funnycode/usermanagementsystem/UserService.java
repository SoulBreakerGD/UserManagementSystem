package com.funnycode.usermanagementsystem;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService implements IUserService{

    private final IUserRepository iUserRepository;

    @Override
    public User createUser(User user) {
        return iUserRepository.save(user);
    }
}
