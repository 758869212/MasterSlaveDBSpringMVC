package com.dong.persistence.dao;

import com.dong.persistence.entity.Role;

/**
 * @author XuDong, Zhu
 * @version 2.4.2
 * @ClassName: RoleMapper
 * @Description: (这里用一句话描述这个类的作用)
 * @date 2017 -02-22 16:19:32
 */
public interface RoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role
     *
     * @param id the id
     * @return int
     * @author XuDong, Zhu
     * @date 2017 -02-22 16:19:32
     * @version 2.4.2
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role
     *
     * @param record the record
     * @return int
     * @author XuDong, Zhu
     * @date 2017 -02-22 16:19:32
     * @version 2.4.2
     * @mbggenerated
     */
    int insert(Role record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role
     *
     * @param record the record
     * @return int
     * @author XuDong, Zhu
     * @date 2017 -02-22 16:19:32
     * @version 2.4.2
     * @mbggenerated
     */
    int insertSelective(Role record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role
     *
     * @param id the id
     * @return role
     * @author XuDong, Zhu
     * @date 2017 -02-22 16:19:32
     * @version 2.4.2
     * @mbggenerated
     */
    Role selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role
     *
     * @param record the record
     * @return int
     * @author XuDong, Zhu
     * @date 2017 -02-22 16:19:32
     * @version 2.4.2
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Role record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role
     *
     * @param record the record
     * @return int
     * @author XuDong, Zhu
     * @date 2017 -02-22 16:19:32
     * @version 2.4.2
     * @mbggenerated
     */
    int updateByPrimaryKey(Role record);
}