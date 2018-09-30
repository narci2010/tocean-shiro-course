package com.toceansoft.shiro.demo9.service;

import com.toceansoft.shiro.demo9.entity.Permission;

public interface PermissionService {
	public Permission createPermission(Permission permission);

	public void deletePermission(Long permissionId);
}
