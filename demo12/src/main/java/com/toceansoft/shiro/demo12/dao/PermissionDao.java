package com.toceansoft.shiro.demo12.dao;

import com.toceansoft.shiro.demo12.entity.Permission;

public interface PermissionDao {

	public Permission createPermission(Permission permission);

	public void deletePermission(Long permissionId);

}
