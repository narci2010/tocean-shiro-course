package com.toceansoft.shiro.demo5.service;

import com.toceansoft.shiro.demo5.entity.Permission;

public interface PermissionService {
	public Permission createPermission(Permission permission);

	public void deletePermission(Long permissionId);
}
