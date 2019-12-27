package com.david.service;

import com.david.mapper.UserDao2;
import com.david.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author David
 * @descritpion
 * @date 2019/12/1
 */

@Service
public class UserService2 {

    @Autowired
    private UserDao2 userDao2;

    public User find(Long id) {
        return userDao2.find2(id);
    }
}
