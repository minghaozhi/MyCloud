package com.moshang.cloud.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.moshang.cloud.entity.SysRole;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SysRoleMapper extends BaseMapper<SysRole> {
    @Select(value = "select role.* from sys_role role,sys_user_role ur where role.id=ur.role_id and ur.user_id=#{userId}")
    List<SysRole> getRoleByUserId(Integer userId);
}