package com.toceansoft.shiro.demo2;

import org.junit.Test;

import junit.framework.Assert;

public class AuthorizerTest extends BaseTest {

	@Test
	public void testIsPermitted() {
		login("classpath:shiro-authorizer.ini", "toceansoft", "123");
		// 判断拥有权限：user:create
		Assert.assertTrue(subject().isPermitted("user1:update"));
		Assert.assertTrue(subject().isPermitted("user2:update"));
		// 通过二进制位的方式表示权限
		Assert.assertTrue(subject().isPermitted("+user1+2"));// 新增权限
		Assert.assertTrue(subject().isPermitted("+user1+8"));// 查看权限
		Assert.assertTrue(subject().isPermitted("+user2+10"));// 新增及查看
		Assert.assertTrue(subject().isPermitted("++4+abc"));// 新增及查看
		Assert.assertFalse(subject().isPermitted("+user1+4"));// 没有删除权限

		Assert.assertTrue(subject().isPermitted("user1:update or user1:delete"));// or
		Assert.assertFalse(subject().isPermitted("user1:update and user3:delete"));// and
		Assert.assertFalse(subject().isPermitted("not user1:update"));// not

		Assert.assertTrue(subject().isPermitted("menu:view"));// 通过MyRolePermissionResolver解析得到的权限
	}

	@Test
	public void testIsPermitted2() {
		login("classpath:shiro-jdbc-authorizer.ini", "toceansoft", "123");
		// 判断拥有权限：user:create
		Assert.assertTrue(subject().isPermitted("user1:update"));
		Assert.assertTrue(subject().isPermitted("user2:update"));
		// 通过二进制位的方式表示权限
		Assert.assertTrue(subject().isPermitted("+user1+2"));// 新增权限
		Assert.assertTrue(subject().isPermitted("+user1+8"));// 查看权限
		Assert.assertTrue(subject().isPermitted("+user2+10"));// 新增及查看

		Assert.assertFalse(subject().isPermitted("+user1+4"));// 没有删除权限

		Assert.assertTrue(subject().isPermitted("menu:view"));// 通过MyRolePermissionResolver解析得到的权限
	}

}
