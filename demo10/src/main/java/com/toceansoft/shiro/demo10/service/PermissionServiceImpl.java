package com.toceansoft.shiro.demo10.service;

import com.toceansoft.shiro.demo10.dao.PermissionDao;
import com.toceansoft.shiro.demo10.entity.Permission;

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
