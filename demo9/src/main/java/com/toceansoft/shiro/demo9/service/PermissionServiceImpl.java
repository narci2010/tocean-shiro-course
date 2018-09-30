package com.toceansoft.shiro.demo9.service;

import com.toceansoft.shiro.demo9.dao.PermissionDao;
import com.toceansoft.shiro.demo9.dao.PermissionDaoImpl;
import com.toceansoft.shiro.demo9.entity.Permission;

public class PermissionServiceImpl implements PermissionService {

	private PermissionDao permissionDao = new PermissionDaoImpl();

	public Permission createPermission(Permission permission) {
		return permissionDao.createPermission(permission);
	}

	public void deletePermission(Long permissionId) {
		permissionDao.deletePermission(permissionId);
	}
}
