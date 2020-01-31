package com.windlike.crm.service.impl;

import com.windlike.crm.dao.ICustomerDao;
import com.windlike.crm.service.ICustomerService;

public class CustomerService implements ICustomerService {

    private ICustomerDao customerDao;

    public void setCustomerDao(ICustomerDao customerDao) {
        this.customerDao = customerDao;
    }
    
}
