package com.windlike.crm.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.windlike.crm.mybatis.pojo.Order;
import com.windlike.crm.mybatis.pojo.OrderUser;
import com.windlike.crm.mybatis.utils.SqlSessionFactoryUtils;

public class OrderMapperTest {

    @Test
    public void testGetOrderUser() {
        SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory()
                        .openSession();
        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
        List<OrderUser> list = orderMapper.getOrderUser();
        for (OrderUser orderUser : list) {
            System.out.println(orderUser);
        }
        sqlSession.close();
    } 
    
    public void testGetOrderResultMap() {
        SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory()
                        .openSession();
        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
        List<Order> list = orderMapper.getOrderResultMap();
        for (Order order : list) {
            System.out.println(order);
        }
        sqlSession.close();
    }

}
