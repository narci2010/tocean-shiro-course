package com.toceansoft.shiro.demo10.dao;

import com.toceansoft.shiro.demo10.entity.Permission;

public interface PermissionDao {

	public Permission createPermission(Permission permission);

	public void deletePermission(Long permissionId);

}
