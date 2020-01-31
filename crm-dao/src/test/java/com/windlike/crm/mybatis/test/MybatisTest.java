package com.windlike.crm.mybatis.test;

import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.windlike.crm.mybatis.pojo.User;
import com.windlike.crm.mybatis.utils.SqlSessionFactoryUtils;

public class MybatisTest {

    @Test
    public void testGetUserById() throws Exception {
        SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = ssfb.build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = sqlSession.selectOne("user.getUserById", 9527);
        System.out.println(user);
        sqlSession.close();
    }
    
    @Test
    public void testGetUserByUsername() {
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<User> users = sqlSession.selectList("user.getUserByUsername", "张");
        for (User user : users) {
            System.out.println(user);
        }
        sqlSession.close();
    }
    
    @Test
    public void testInsertUser() {
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        User user = new User();
        user.setUsername("张飞");
        user.setSex("1");
        user.setBirthday(new SimpleDateFormat("yyyy-mm-dd").format(new Date()));
        user.setAddress("上海浦东");
        int insertCount = sqlSession.insert("user.insertUser", user);
        System.out.println(insertCount);
        System.out.println(user.getUserid());
        // 提交事务 设置了openSession为true就不用写了。
        // sqlSession.commit();
        sqlSession.close();
    }
    
    @Test
    public void testUpdateUser() {
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        User user = new User();
        user.setUserid(030120);
        user.setUsername("张角");
        sqlSession.update("user.updateUser", user);
        sqlSession.close();
    }
    
    @Test
    public void testDeleteUser() {
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        sqlSession.delete("user.deleteUser", 33);
        sqlSession.close();
    }
}
