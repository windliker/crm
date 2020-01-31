package com.windlike.crm.mybatis.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.windlike.crm.mybatis.dao.UserDao;
import com.windlike.crm.mybatis.pojo.User;
import com.windlike.crm.mybatis.utils.SqlSessionFactoryUtils;

// extends SqlSessionDaoSupport 交给spring管理
public class UserDaoImpl implements UserDao {

    @Override
    public User getUserById(Integer id) {
        SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
        User user = sqlSession.selectOne("user.getUserById", id);
        sqlSession.close();
        return user;
    }

    @Override
    public List<User> getUserByUsername(String username) {
        SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
        List<User> users = sqlSession.selectList("user.getUserByUsername", username);
        sqlSession.close();
        return users;
    }

    @Override
    public void insertUser(User user) {
        SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession(true);
        List<User> users = sqlSession.selectList("user.insertUser", user);
        sqlSession.close();
    }

}
