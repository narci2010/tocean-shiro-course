package com.toceansoft.shiro.demo4.utils;

import org.apache.shiro.authc.credential.PasswordService;

public class PasswordHelper {
	private PasswordService passwordService;

	public void setPasswordService(PasswordService passwordService) {
		this.passwordService = passwordService;
		// 给账号abc生成密码，保存到数据库
		genPassword("hello");
	}

	public String genPassword(String password) {
		System.out.println(passwordService.encryptPassword(password));
		return passwordService.encryptPassword(password);
	}

}
