package com.toceansoft.shiro.demo10.service;

import com.toceansoft.shiro.demo10.entity.Permission;

public interface PermissionService {
	public Permission createPermission(Permission permission);

	public void deletePermission(Long permissionId);
}
