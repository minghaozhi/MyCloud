package com.moshang.cloud.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@TableName( "sys_user")
@Data
public class SysUser {
    @TableId
    private Integer id;

    private String image;

    private String userName;
    private String realName;

    private String password;

    private String salt;
    private String email;

    private Date birthday;

    private String sex;
    private Integer age;


    private String phone;

    private Integer enable;

    private Date createTime;
    private Date updateTime;

}