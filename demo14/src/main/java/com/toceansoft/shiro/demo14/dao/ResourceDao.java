package com.toceansoft.shiro.demo14.dao;

import java.util.List;

import com.toceansoft.shiro.demo14.entity.Resource;

public interface ResourceDao {

	public Resource createResource(Resource resource);

	public Resource updateResource(Resource resource);

	public void deleteResource(Long resourceId);

	Resource findOne(Long resourceId);

	List<Resource> findAll();

}
