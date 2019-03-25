package com.moshang.cloud.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @program: MyCloud
 * @description: ${description}
 * @author: moshang
 * @create: 2019-03-21 17:45
 **/
@Data
@TableName("sys_user")
public class User {
    @TableId
    private Integer id;

    private String userName;

    private String password;
    /**
     * shiro加密盐
     */
    private String salt;

    private Integer age;
    private String sex;
    private String phone;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8",locale = "zh")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date birthday;

    private String email;

    private String image;

    private String realName;


    private Integer locked;
    private Integer thirdLoginId;
    private Date lastLoginTime;

    public User(String userName, String password,  Integer locked) {
        this.userName = userName;
        this.password = password;
        this.locked = locked;
    }
}
