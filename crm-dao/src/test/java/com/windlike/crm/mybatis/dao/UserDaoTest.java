package com.windlike.crm.mybatis.dao;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.windlike.crm.mybatis.dao.impl.UserDaoImpl;
import com.windlike.crm.mybatis.pojo.User;

public class UserDaoTest {

    private ApplicationContext applicationContext;
    
    @Before
    public void init() {
        applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    }
    
    @Test
    public void testGetUserById() {
        UserDao userDao = applicationContext.getBean(UserDao.class);
        User user = userDao.getUserById(30);
        System.out.println(user);
    }

    @Test
    public void testGetUserByUsername() {
        UserDao userDao = new UserDaoImpl();
        List<User> users = userDao.getUserByUsername("张");
        for(User user : users) {
            System.out.println(user);
        }
   }

    @Test
    public void testInsertUser() {
        UserDao userDao = new UserDaoImpl();
        User user = new User();
        user.setUsername("张飞2");
        user.setSex("1");
        user.setBirthday(new SimpleDateFormat("yyyymmdd").format(new Date()));
        userDao.insertUser(user);
        System.out.println(user.getUserid());
    }

}
