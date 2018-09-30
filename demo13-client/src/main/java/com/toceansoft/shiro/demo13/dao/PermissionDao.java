package com.toceansoft.shiro.demo13.dao;

import com.toceansoft.shiro.demo13.entity.Permission;

public interface PermissionDao {

	public Permission createPermission(Permission permission);

	public void deletePermission(Long permissionId);

}
