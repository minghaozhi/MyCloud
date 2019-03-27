package com.moshang.cloud.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@TableName("sys_role")
@Data
public class SysRole {

    @TableId
    private Integer id;

    private String name;

    private String value;

    private String tips;

    private Date createTime;

    private Date updateTime;

    private Integer status;
}