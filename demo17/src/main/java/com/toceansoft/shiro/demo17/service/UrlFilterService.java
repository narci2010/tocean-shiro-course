package com.toceansoft.shiro.demo17.service;

import java.util.List;

import com.toceansoft.shiro.demo17.entity.UrlFilter;

/**
 * <p>User: Toceansoft INC.
 * <p>Date: 14-1-28
 * <p>Version: 1.0
 */
public interface UrlFilterService {

    public UrlFilter createUrlFilter(UrlFilter urlFilter);
    public UrlFilter updateUrlFilter(UrlFilter urlFilter);
    public void deleteUrlFilter(Long urlFilterId);

    public UrlFilter findOne(Long urlFilterId);
    public List<UrlFilter> findAll();
}
