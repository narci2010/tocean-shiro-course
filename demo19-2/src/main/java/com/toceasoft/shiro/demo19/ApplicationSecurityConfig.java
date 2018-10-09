package com.toceasoft.shiro.demo19;

import org.jsets.shiro.config.FilterChainConfig;
import org.jsets.shiro.config.JsetsShiroConfigurationAdapter;
import org.jsets.shiro.config.SecurityManagerConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.toceasoft.shiro.demo19.service.AccountProviderImpl;
import com.toceasoft.shiro.demo19.service.FilteRulesProviderImpl;
import com.toceasoft.shiro.demo19.service.PasswdRetryLimitHandlerImpl;

/**
 * 系统安全配置 继承自JsetsShiroConfigurationAdapter以扩展、定制鉴权组件
 * 
 * @author Toceansoft(https://github.com/narci2010)
 * @date 2016年8月05日
 *
 */
@Configuration
public class ApplicationSecurityConfig extends JsetsShiroConfigurationAdapter {

	// 账号信息提供者
	@Autowired
	private AccountProviderImpl accountProviderImpl;
	// 密码输入错误次数超限处理器
	@Autowired
	private PasswdRetryLimitHandlerImpl passwdRetryLimitHandlerImpl;
	// 动态URL过滤规则
	@Autowired
	private FilteRulesProviderImpl filteRulesProviderImpl;

	@Override
	protected void configure(SecurityManagerConfig securityManager) {
		securityManager.setAccountProvider(accountProviderImpl);
		securityManager.setPasswdRetryLimitHandler(passwdRetryLimitHandlerImpl);
	}

	@Override
	protected void configure(FilterChainConfig filterChain) {
		filterChain.setShiroFilteRulesProvider(filteRulesProviderImpl);
	}

}