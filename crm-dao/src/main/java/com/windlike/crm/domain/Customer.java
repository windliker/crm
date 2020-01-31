package com.windlike.crm.domain;

import java.io.Serializable;

/**
 * PO(Persistence Object)持久化类
 * 7个规范
 * 1. 公有类
 * 2. 公有无参构造 默认就有
 * 3. 私有属性
 * 4. 公有的getter和setter
 * 5. 实现java.io.Serializable接口
 * 6. 不能用final修饰
 * 7. 如果是基础类型，要使用它的包装类
 * @author windlike
 *
 */
public class Customer implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

}
