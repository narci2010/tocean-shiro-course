/*
 * Copyright 2017-2018 the original author(https://github.com/narci2010)
 * 
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </p>
 */
package com.toceasoft.shiro.demo19.service;

import java.util.List;
import org.jsets.jdbc.JdbcEnhance;
import org.jsets.jdbc.util.SqlBuilder;
import org.jsets.shiro.util.ShiroUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.toceasoft.shiro.demo19.entity.ResourceEntity;
import com.toceasoft.shiro.demo19.entity.RoleResourceEntity;
import com.toceasoft.shiro.demo19.util.CommonUtil;

/**
 * 角色资源管理Service
 * 
 * 需要注意当 角色对应的资源改变，要刷新动态过滤规则 shiroSecurityService.reloadFilterRules();
 * 
 * @author Toceansoft(https://github.com/narci2010)
 * @date 2016年9月15日
 */ 
@Service
public class RoleResourceService {
	
	@Autowired
	private JdbcEnhance jdbcEnhance;
	
	@Transactional
	public void save(String roleId, String resourceIds){
		this.deleteResourceByRole(roleId);
		for(String resourceId:CommonUtil.split(resourceIds)){
			RoleResourceEntity roleResource = new RoleResourceEntity();
			roleResource.setRoleId(roleId);
			roleResource.setResourceId(resourceId);
			this.save(roleResource);
		}
	}

	public void save(RoleResourceEntity roleResource){
		jdbcEnhance.insert(roleResource);
		// 角色对应的资源改变，要刷新动态过滤规则
		ShiroUtils.reloadFilterRules();
	}
	
	public void deleteResourceByRole(String roleId){
		jdbcEnhance.delete(SqlBuilder.BUILD()
						.DELETE_FROM("T_ROLE_RESOURCE")
						.WHERE("ROLE_ID = ?")
					, roleId);
	}
	public List<ResourceEntity> listResourceByRole(String roleId){
		return jdbcEnhance
				.selector()
				.SELECT("R.*")
				.FROM("T_ROLE_RESOURCE T")
				.JOIN("T_RESOURCE R ON T.RESOURCE_ID = R.ID")
				.WHERE("T.ROLE_ID = ?")
				.entityClass(ResourceEntity.class)
				.parameter(roleId)
				.list();
	}
}