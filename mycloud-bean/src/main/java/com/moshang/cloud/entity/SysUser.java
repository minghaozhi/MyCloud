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

    private String avatar;

    private String username;

    private String password;

    private String salt;

    private String name;

    private Date birthday;

    private Integer sex;

    private String email;

    private String phone;

    private Integer status;

    private Date createTime;
    private Date updateTime;

}