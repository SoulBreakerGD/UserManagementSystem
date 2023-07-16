package com.funnycode.usermanagementsystem;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final IUserService iUserService;

    @GetMapping("/users")
    public User createUser(@RequestBody User user) {

        return iUserService.createUser(user);
    }
}
