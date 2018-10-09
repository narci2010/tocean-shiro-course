package com.toceasoft.shiro.demo19.action;

import org.jsets.shiro.service.ShiroSecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.toceasoft.shiro.demo19.domain.BaseResponse;
/**
 * JWT令牌鉴权   测试API
 *
 * @author Toceansoft(https://github.com/narci2010)
 * @date 2016年9月15日
 */
@RestController
@RequestMapping("/jwt_api")
public class JwtApiAction {
	
	@Autowired(required = false)
	private ShiroSecurityService shiroSecurityService;
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public BaseResponse add() {
		return BaseResponse.ok().message("add成功");
	}
	
	@RequestMapping(value="/delete",method=RequestMethod.GET)
	public BaseResponse delete() {
		return BaseResponse.ok().message("delete成功");
	}
	
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public BaseResponse update() {
		return BaseResponse.ok().message("update成功");
	}
}