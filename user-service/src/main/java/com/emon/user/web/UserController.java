package com.emon.user.web;

import com.emon.user.pojo.User;
import com.emon.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getUser")
    public User getUser(Long id){
        User user = userService.queryById(id);
        return user;
    }
}
