package com.david.controller;


import com.baomidou.mybatisplus.plugins.Page;
import com.david.entity.User;
import com.david.service.UserService;
import com.david.service.UserService2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author David
 * @descritpion
 * @date 2019/11/22
 */

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserService2 userService2;

    @Value("${david}")
    private String david;

    @GetMapping("/{id}")
    public User get(@PathVariable("id") Long id) {
        log.info("======== get user id:{} ==============", id);
        return userService.find(id);
    }

    @GetMapping("/v2/{id}")
    public User getV2(@PathVariable("id") Long id) {
        return userService2.find(id);
    }

    @GetMapping()
    public Page<Map<String, Object>> page(@RequestParam(value = "page", defaultValue = "1") int pageNum,
                                          @RequestParam(value = "size", defaultValue = "10") int pageSize) {

        log.info("page:" + pageNum + ", pageSize:" + pageSize);
        Page<User> page = new Page<>();
        page.setCurrent(pageNum);
        page.setSize(pageSize);

        User user = new User();
        return userService.findByPage(page, user);
    }


}
