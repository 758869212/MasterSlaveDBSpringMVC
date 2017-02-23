package com.dong.service.impl;

import com.dong.persistence.entity.User;
import com.dong.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Log4jConfigurer;

import java.io.FileNotFoundException;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:/spring-config.xml"})
public class UserServiceImplTest {

    static {
        try {
            Log4jConfigurer.initLogging("classpath:log/log4j.xml");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Autowired
    private UserService userService;

    @Test
    public void testCreateUser() throws Exception {
        User user = new User();
        user.setUsername("username");
        user.setOrganizationId(1L);

        userService.createUser(user);
    }

    @Test
    public void testFindOne() throws Exception {
        Long userId = 4L;
        User user = userService.findOne(userId);
        System.out.println("user = " + user.toString());
    }
}