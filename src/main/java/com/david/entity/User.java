package com.david.entity;

import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;
import lombok.ToString;

/**
 * @author David
 * @descritpion 用户表
 * @date 2019/11/22
 */

@Data
@ToString
@TableName("user")
public class User {

    private Long id;

    private String name;

    private String email;

    private String province;
}
