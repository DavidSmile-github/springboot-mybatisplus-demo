package com.david.service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.david.dao.UserDao;
import com.david.entity.User;
import org.springframework.stereotype.Service;

/**
 * @author David
 * @descritpion
 * @date 2019/11/22
 */
@Service
public class UserService extends ServiceImpl<UserDao, User> {

   public User find(Long id) {
       return this.baseMapper.selectById(id);
   }
}
