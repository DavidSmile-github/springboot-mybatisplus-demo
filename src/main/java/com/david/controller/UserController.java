package com.david.controller;


import com.david.entity.User;
import com.david.service.UserService;
import com.david.service.UserService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author David
 * @descritpion
 * @date 2019/11/22
 */

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserService2 userService2;

    @GetMapping("/{id}")
    public User get(@PathVariable("id") Long id) {
        return userService.find(id);
    }

    @GetMapping("/v2/{id}")
    public User getV2(@PathVariable("id") Long id) {
        return userService2.find(id);
    }
}
