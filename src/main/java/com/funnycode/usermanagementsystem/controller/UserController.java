package com.funnycode.usermanagementsystem.controller;

import com.funnycode.usermanagementsystem.service.IUserService;
import com.funnycode.usermanagementsystem.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor // inject service vào controller
public class UserController {

    private final IUserService iUserService;

    @PostMapping("/users") // tiếp nhận request từ ng dùng
    public User createUser(@RequestBody User user) { // nhận request body từ ng dùng
        return iUserService.createUser(user);
    }
}
