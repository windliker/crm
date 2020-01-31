package com.windlike.crm.mybatis.mapper;

import static org.junit.Assert.fail;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.windlike.crm.mybatis.pojo.Order;
import com.windlike.crm.mybatis.pojo.User;
import com.windlike.crm.mybatis.utils.SqlSessionFactoryUtils;

public class UserMapperTest {

    @Test
    public void testGetUserById() {
        fail("Not yet implemented");
    }

    @Test
    public void testGetUserByUserName() {
        fail("Not yet implemented");
    }

    @Test
    public void testInsertUser() {
        fail("Not yet implemented");
    }

    @Test
    public void testGetUserByQueryVo() {
        fail("Not yet implemented");
    }

    @Test
    public void testGetUserCount() {
        fail("Not yet implemented");
    }

    @Test
    public void testGetUserByPojo() {
        fail("Not yet implemented");
    }

    @Test
    public void testGetUserByIds() {
        fail("Not yet implemented");
    }

    @Test
    public void testGetUserResultMap() {
        SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory()
                        .openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> list = userMapper.getUserResultMap();
        for (User user : list) {
            System.out.println(user);
            for(Order order : user.getOrders()) {
                System.out.println(order);
            }
        }
        sqlSession.close();
    }

}
