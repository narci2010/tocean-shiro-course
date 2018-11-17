package com.toceansoft.shiro.demo20.service;

import java.util.List;

/**
 * <p>User: Narci Lee
 * <p>Date: 14-1-28
 * <p>Version: 1.0
 */
public interface UserRunAsService {

    public void grantRunAs(Long fromUserId, Long toUserId);
    public void revokeRunAs(Long fromUserId, Long toUserId);

    public boolean exists(Long fromUserId, Long toUserId);

    public List<Long> findFromUserIds(Long toUserId);
    public List<Long> findToUserIds(Long fromUserId);

}
