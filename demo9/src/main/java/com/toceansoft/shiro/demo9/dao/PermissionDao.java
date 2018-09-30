package com.toceansoft.shiro.demo9.dao;

import com.toceansoft.shiro.demo9.entity.Permission;

public interface PermissionDao {

	public Permission createPermission(Permission permission);

	public void deletePermission(Long permissionId);

}
