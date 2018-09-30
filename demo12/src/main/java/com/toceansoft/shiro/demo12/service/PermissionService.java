package com.toceansoft.shiro.demo12.service;

import com.toceansoft.shiro.demo12.entity.Permission;

public interface PermissionService {
	public Permission createPermission(Permission permission);

	public void deletePermission(Long permissionId);
}
