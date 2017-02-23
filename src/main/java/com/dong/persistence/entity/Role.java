package com.dong.persistence.entity;

/**
 * @author XuDong, Zhu
 * @version 2.4.2
 * @ClassName: Role
 * @Description: (这里用一句话描述这个类的作用)
 * @date 2017 -02-22 16:19:33
 */
public class Role {
    /**
     * 角色表主键
     */
    private Long id;

    /**
     * 角色名称
     */
    private String role;

    /**
     * 角色描述（界面显示名称）
     */
    private String description;

    /**
     * 拥有资源列表
     */
    private String resourceIds;

    /**
     * 是否有效
     */
    private Boolean available;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.id
     *
     * @return the value of sys_role.id
     * @author XuDong, Zhu
     * @date 2017 -02-22 16:19:33
     * @version 2.4.2
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.id
     *
     * @param id the value for sys_role.id
     * @author XuDong, Zhu
     * @date 2017 -02-22 16:19:33
     * @version 2.4.2
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.role
     *
     * @return the value of sys_role.role
     * @author XuDong, Zhu
     * @date 2017 -02-22 16:19:33
     * @version 2.4.2
     * @mbggenerated
     */
    public String getRole() {
        return role;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.role
     *
     * @param role the value for sys_role.role
     * @author XuDong, Zhu
     * @date 2017 -02-22 16:19:33
     * @version 2.4.2
     * @mbggenerated
     */
    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.description
     *
     * @return the value of sys_role.description
     * @author XuDong, Zhu
     * @date 2017 -02-22 16:19:33
     * @version 2.4.2
     * @mbggenerated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.description
     *
     * @param description the value for sys_role.description
     * @author XuDong, Zhu
     * @date 2017 -02-22 16:19:33
     * @version 2.4.2
     * @mbggenerated
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.resource_ids
     *
     * @return the value of sys_role.resource_ids
     * @author XuDong, Zhu
     * @date 2017 -02-22 16:19:33
     * @version 2.4.2
     * @mbggenerated
     */
    public String getResourceIds() {
        return resourceIds;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.resource_ids
     *
     * @param resourceIds the value for sys_role.resource_ids
     * @author XuDong, Zhu
     * @date 2017 -02-22 16:19:33
     * @version 2.4.2
     * @mbggenerated
     */
    public void setResourceIds(String resourceIds) {
        this.resourceIds = resourceIds == null ? null : resourceIds.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.available
     *
     * @return the value of sys_role.available
     * @author XuDong, Zhu
     * @date 2017 -02-22 16:19:33
     * @version 2.4.2
     * @mbggenerated
     */
    public Boolean getAvailable() {
        return available;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.available
     *
     * @param available the value for sys_role.available
     * @author XuDong, Zhu
     * @date 2017 -02-22 16:19:33
     * @version 2.4.2
     * @mbggenerated
     */
    public void setAvailable(Boolean available) {
        this.available = available;
    }
}