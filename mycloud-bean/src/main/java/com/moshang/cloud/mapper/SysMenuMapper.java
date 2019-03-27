package com.moshang.cloud.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.moshang.cloud.entity.SysMenu;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @program: MyCloud
 * @description: ${description}
 * @author: moshang
 * @create: 2019-03-27 14:17
 **/
public interface SysMenuMapper extends BaseMapper<SysMenu> {
    @Select(value = "select menu.* from sys_menu menu,sys_privilege p where menu.id=p.menu_id and p.role_id=#{roleId}")
    List<SysMenu> getPermissionsByRoleId(Integer roleId);
}
