package com.toceansoft.shiro.demo22.web.shiro.filter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.shiro.session.Session;
import org.apache.shiro.web.filter.AccessControlFilter;
import org.apache.shiro.web.util.WebUtils;

import com.toceansoft.shiro.demo22.Constants;

/**
 * <p>
 * User: Narci Lee
 * <p>
 * Date: 14-3-16
 * <p>
 * Version: 1.0
 */
public class ForceLogoutFilter extends AccessControlFilter {

	@Override
	protected boolean isAccessAllowed(ServletRequest request, ServletResponse response,
			Object mappedValue) throws Exception {
		Session session = getSubject(request, response).getSession(false);
		if (session == null) {
			return true;
		}
		return session.getAttribute(Constants.SESSION_FORCE_LOGOUT_KEY) == null;
		// 如果session中SESSION_FORCE_LOGOUT_KEY不为空，则执行onAccessDenied
	}

	@Override
	protected boolean onAccessDenied(ServletRequest request, ServletResponse response)
			throws Exception {
		try {
			getSubject(request, response).logout();// 强制退出
		} catch (Exception e) {
			/* ignore exception */}

		String loginUrl = getLoginUrl() + (getLoginUrl().contains("?") ? "&" : "?")
				+ "forceLogout=1";
		WebUtils.issueRedirect(request, response, loginUrl);
		return false;
	}
}
