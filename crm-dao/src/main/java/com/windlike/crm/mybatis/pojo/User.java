package com.windlike.crm.mybatis.pojo;

import java.util.List;

public class User {
    
    private Integer userid;
    
    private String username;

    private String birthday;
    
    private String sex;
    
    private String address;
    
    private List<Order> orders;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
    
    @Override
    public String toString() {
        return "User [userid=" + userid + ", username=" + username
                        + ", birthday=" + birthday + ", sex=" + sex
                        + ", address=" + address + ", orders=" + orders + "]";
    }
}
