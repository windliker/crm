package com.windlike.crm.mybatis.dao;

import java.util.List;

import com.windlike.crm.mybatis.pojo.User;

/**
 * 用户信息持久化接口
 * @author windlike
 *
 */
public interface UserDao {

    /**
     * 根据用户ID查询用户信息
     * @param id
     * @return
     */
    User getUserById(Integer id);
    
    /**
     * 根据用户名查找用户列表
     * @param username
     * @return
     */
    List<User> getUserByUsername(String username);
    
    /**
     * 添加用户
     * @param user
     */
    void insertUser(User user);
}
