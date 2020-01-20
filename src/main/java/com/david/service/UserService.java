package com.david.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.david.mapper.UserDao;
import com.david.entity.User;
import org.springframework.stereotype.Service;

import java.util.Map;

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

   public Page<Map<String, Object>> findByPage(Page page, User user) {
       EntityWrapper<User> wrapper = new EntityWrapper<>();
       wrapper.lt("id", 5);

       return this.selectMapsPage(page, wrapper);
   }
}
