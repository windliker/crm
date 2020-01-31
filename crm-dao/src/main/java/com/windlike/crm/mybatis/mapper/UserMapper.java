package com.windlike.crm.mybatis.mapper;

import java.util.List;

import com.windlike.crm.mybatis.pojo.QueryVo;
import com.windlike.crm.mybatis.pojo.User;

public interface UserMapper {

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
    List<User> getUserByUserName(String username);
    
    /**
     * 添加用户
     * @param user
     */
    void insertUser(User user);
    
    /**
     * 传递包装pojo
     * @return
     */
    List<User> getUserByQueryVo(QueryVo vo);
    
    /**
     * getUserCount
     * @return
     */
    Integer getUserCount();
    
    /**
     * getUserByPojo
     * @param user
     * @return
     */
    List<User> getUserByPojo(User user);
    
    /**
     * getUsersByIds
     * @param vo
     * @return
     */
    List<User> getUserByIds(QueryVo vo);
    
    /**
     * 一对多 ResultMap
     * @return
     */
    List<User> getUserResultMap();
}
