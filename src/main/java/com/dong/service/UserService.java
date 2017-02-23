package com.dong.service;

import com.dong.annotation.DataSource;
import com.dong.annotation.DataSourceEnum;
import com.dong.persistence.entity.User;

/**
 * Created by admin on 2017/2/22.
 */
public interface UserService {
    /**
     * Create user.
     *
     * @param user the user
     * @throws Exception the exception
     * @author XuDong, Zhu
     * @date 2017 -02-22 16:56:20
     * @version 2.4.2
     */
    @DataSource(DataSourceEnum.DATA_SOURCE_WRITE)
    void createUser(User user) throws Exception;

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
    @DataSource(DataSourceEnum.DATA_SOURCE_READ)
    User findOne(Long userId) throws Exception;
}
