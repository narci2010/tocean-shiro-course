package com.toceansoft.shiro.demo20.service;

import java.util.List;
import java.util.Set;

import com.toceansoft.shiro.demo20.entity.Role;

/**
 * <p>User: Narci Lee
 * <p>Date: 14-1-28
 * <p>Version: 1.0
 */
public interface RoleService {


    public Role createRole(Role role);
    public Role updateRole(Role role);
    public void deleteRole(Long roleId);

    public Role findOne(Long roleId);
    public List<Role> findAll();

    /**
     * 根据角色编号得到角色标识符列表
     * @param roleIds
     * @return
     */
    Set<String> findRoles(Long... roleIds);

    /**
     * 根据角色编号得到权限字符串列表
     * @param roleIds
     * @return
     */
    Set<String> findPermissions(Long[] roleIds);
}
