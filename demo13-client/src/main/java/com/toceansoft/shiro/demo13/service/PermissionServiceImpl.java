package com.toceansoft.shiro.demo13.service;

import com.toceansoft.shiro.demo13.dao.PermissionDao;
import com.toceansoft.shiro.demo13.entity.Permission;

public class PermissionServiceImpl implements PermissionService {

	private PermissionDao permissionDao;

	public void setPermissionDao(PermissionDao permissionDao) {
		this.permissionDao = permissionDao;
	}

	public Permission createPermission(Permission permission) {
		return permissionDao.createPermission(permission);
	}

	public void deletePermission(Long permissionId) {
		permissionDao.deletePermission(permissionId);
	}
}
