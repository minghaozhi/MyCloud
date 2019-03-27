package com.moshang.cloud.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@TableName("sys_role")
public class Role implements Serializable {
    private static final long serialVersionUID = 2179037393108205286L;
    @TableId
    private Integer id;

    private String name;

    private String value;

    private String tips;

    private Date createTime;

    private Date updateTime;

    private Integer status;
}
