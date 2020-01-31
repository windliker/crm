package com.windlike.crm.mybatis.mapper;

import java.util.List;

import com.windlike.crm.mybatis.pojo.Order;
import com.windlike.crm.mybatis.pojo.OrderUser;

public interface OrderMapper {

    /**
     * 一对一关联：ResultType
     * @return
     */
    List<OrderUser> getOrderUser();
    
    /**
     * 一对一关联：ResultMap 推荐
     * @return
     */
    List<Order> getOrderResultMap();
}
