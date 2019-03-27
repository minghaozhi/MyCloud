package com.moshang.cloud.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@TableName( "sys_menu")
@Data
public class SysMenu {

    @TableId
    private Integer id;

    /**
     * 菜单编码
     */
    private String code;

    /**
     * 菜单父编码
     */
    private String pCode;

    /**
     * 父菜单ID
     */
    private String pId;

    /**
     * 名称
     */
    private String name;

    /**
     * 请求地址
     */
    private String url;

    /**
     * 是否是菜单
     */
    private Integer isMenu;

    /**
     * 菜单层级
     */
    private Integer level;

    /**
     * 菜单排序
     */
    private Integer sort;

    private Integer status;

    private String icon;

    private Date createTime;

    private Date updateTime;

}