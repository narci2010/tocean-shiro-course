package com.toceansoft.shiro.demo5.dao;

import com.toceansoft.shiro.demo5.entity.Permission;

public interface PermissionDao {

	public Permission createPermission(Permission permission);

	public void deletePermission(Long permissionId);

}
