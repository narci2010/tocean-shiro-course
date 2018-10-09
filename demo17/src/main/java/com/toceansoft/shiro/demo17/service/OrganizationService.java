package com.toceansoft.shiro.demo17.service;

import java.util.List;

import com.toceansoft.shiro.demo17.entity.Organization;

/**
 * <p>User: Toceansoft INC.
 * <p>Date: 14-1-28
 * <p>Version: 1.0
 */
public interface OrganizationService {


    public Organization createOrganization(Organization organization);
    public Organization updateOrganization(Organization organization);
    public void deleteOrganization(Long organizationId);

    Organization findOne(Long organizationId);
    List<Organization> findAll();

    Object findAllWithExclude(Organization excludeOraganization);

    void move(Organization source, Organization target);
}