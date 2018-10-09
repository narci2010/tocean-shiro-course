package com.toceansoft.shiro.demo17.dao;

import java.util.List;

import com.toceansoft.shiro.demo17.entity.Resource;

/**
 * <p>Resource: Toceansoft INC.
 * <p>Date: 14-1-28
 * <p>Version: 1.0
 */
public interface ResourceDao {

    public Resource createResource(Resource resource);
    public Resource updateResource(Resource resource);
    public void deleteResource(Long resourceId);

    Resource findOne(Long resourceId);
    List<Resource> findAll();

}
