package com.windlike.crm.mybatis.test;

import java.util.Arrays;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.windlike.crm.mybatis.mapper.UserMapper;
import com.windlike.crm.mybatis.pojo.QueryVo;
import com.windlike.crm.mybatis.pojo.User;
import com.windlike.crm.mybatis.utils.SqlSessionFactoryUtils;

public class UserMapperTest {

    @Test
    public void testGetUserById() {
        SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.getUserById(9527);
        System.out.println(user);
        sqlSession.close();
    }
    
    @Test
    public void testGetUserByUserName() {
        SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory()
                        .openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = userMapper.getUserByUserName("张");
        for (User user : users) {
            System.out.println(user);
        }
        sqlSession.close();
    }
    
    @Test
    public void testInsertUser() {
        SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory()
                        .openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setUsername("赵子龙");
        user.setSex("1");
        user.setBirthday("2020-01-30");
        user.setAddress("上海");
        userMapper.insertUser(user);
        sqlSession.commit();
        sqlSession.close();
    }
    
    @Test
    public void testGetUserByQueryVo() {
        SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory()
                        .openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        QueryVo vo = new QueryVo();
        User user = new User();
        user.setUsername("张");
        vo.setUser(user);
        List<User> users = userMapper.getUserByQueryVo(vo);
        for(User u : users) {
            System.out.println(u);
        }
        sqlSession.close();
    }
    
    @Test
    public void testGetUserByIds() {
        SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        QueryVo vo = new QueryVo();
        vo.setIds(Arrays.asList(1,25,29,30,35));
        List<User> users = userMapper.getUserByIds(vo);
        for(User u : users) {
            System.out.println(u);
        }
        sqlSession.close();
    }
}
