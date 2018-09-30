package com.toceansoft.shiro.demo5.service;

import com.toceansoft.shiro.demo5.dao.PermissionDao;
import com.toceansoft.shiro.demo5.dao.PermissionDaoImpl;
import com.toceansoft.shiro.demo5.entity.Permission;

public class PermissionServiceImpl implements PermissionService {

	private PermissionDao permissionDao = new PermissionDaoImpl();

	public Permission createPermission(Permission permission) {
		return permissionDao.createPermission(permission);
	}

	public void deletePermission(Long permissionId) {
		permissionDao.deletePermission(permissionId);
	}
}
