package com.toceansoft.shiro.demo11.service;

import com.toceansoft.shiro.demo11.entity.Permission;

public interface PermissionService {
	public Permission createPermission(Permission permission);

	public void deletePermission(Long permissionId);
}
