package com.toceansoft.shiro.demo11.dao;

import com.toceansoft.shiro.demo11.entity.Permission;

public interface PermissionDao {

	public Permission createPermission(Permission permission);

	public void deletePermission(Long permissionId);

}
