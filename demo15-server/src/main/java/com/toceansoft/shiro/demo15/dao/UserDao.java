package com.toceansoft.shiro.demo15.dao;

import java.util.List;

import com.toceansoft.shiro.demo15.entity.User;

/**
 * <p>User: Toceansoft INC.
 * <p>Date: 14-1-28
 * <p>Version: 1.0
 */
public interface UserDao {

    public User createUser(User user);
    public User updateUser(User user);
    public void deleteUser(Long userId);

    User findOne(Long userId);

    List<User> findAll();

    User findByUsername(String username);

}
