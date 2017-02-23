package com.dong.service.impl;

import com.dong.persistence.dao.UserMapper;
import com.dong.persistence.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author XuDong, Zhu
 * @version 2.4.2
 * @ClassName: UserServiceImpl
 * @Description: (这里用一句话描述这个类的作用)
 * @date 2017 -02-22 16:56:20
 */
@Service
public class UserServiceImpl implements com.dong.service.UserService {

    /**
     * The constant userMapper.
     */
    @Autowired
    private UserMapper userMapper;

    /**
     * Create user.
     *
     * @param user the user
     * @throws Exception the exception
     * @author XuDong, Zhu
     * @date 2017 -02-22 16:56:20
     * @version 2.4.2
     */
    @Override
    public void createUser(User user) throws Exception {
        userMapper.insertSelective(user);
    }

    /**
     * Find one.
     *
     * @param userId the user id
     * @return user
     * @throws Exception the exception
     * @author XuDong, Zhu
     * @date 2017 -02-22 16:56:20
     * @version 2.4.2
     */
    @Override
    public User findOne(Long userId) throws Exception {
        return userMapper.selectByPrimaryKey(userId);
    }
}
