package com.david.entity;

import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

/**
 * @author David
 * @descritpion 用户表
 * @date 2019/11/22
 */

@Data
@TableName("user")
public class User {

    private Long id;

    private String username;

    private String password;

    private String name;
}
