package org.lanqiao.dao;


import org.junit.Test;
import org.lanqiao.User;

public class domainTest {
    @Test
    public  void UserTest(){
        User user =new User();
        user.showInfo("张三",16);
    }


}
