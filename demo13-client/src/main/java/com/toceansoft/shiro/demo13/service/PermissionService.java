package com.toceansoft.shiro.demo13.service;

import com.toceansoft.shiro.demo13.entity.Permission;

public interface PermissionService {
	public Permission createPermission(Permission permission);

	public void deletePermission(Long permissionId);
}
