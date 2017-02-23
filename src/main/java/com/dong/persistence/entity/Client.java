package com.dong.persistence.entity;

/**
 * @author XuDong, Zhu
 * @version 2.4.2
 * @ClassName: Client
 * @Description: (这里用一句话描述这个类的作用)
 * @date 2017 -02-22 16:19:34
 */
public class Client {
    /**
     * 客户端主键
     */
    private Long id;

    /**
     * 客户端名称
     */
    private String clientName;

    /**
     * 客户端授权ID
     */
    private String clientId;

    /**
     * 客户端安全 key
     */
    private String clientSecret;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oauth2_client.id
     *
     * @return the value of oauth2_client.id
     * @author XuDong, Zhu
     * @date 2017 -02-22 16:19:34
     * @version 2.4.2
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oauth2_client.id
     *
     * @param id the value for oauth2_client.id
     * @author XuDong, Zhu
     * @date 2017 -02-22 16:19:34
     * @version 2.4.2
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oauth2_client.client_name
     *
     * @return the value of oauth2_client.client_name
     * @author XuDong, Zhu
     * @date 2017 -02-22 16:19:34
     * @version 2.4.2
     * @mbggenerated
     */
    public String getClientName() {
        return clientName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oauth2_client.client_name
     *
     * @param clientName the value for oauth2_client.client_name
     * @author XuDong, Zhu
     * @date 2017 -02-22 16:19:34
     * @version 2.4.2
     * @mbggenerated
     */
    public void setClientName(String clientName) {
        this.clientName = clientName == null ? null : clientName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oauth2_client.client_id
     *
     * @return the value of oauth2_client.client_id
     * @author XuDong, Zhu
     * @date 2017 -02-22 16:19:34
     * @version 2.4.2
     * @mbggenerated
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oauth2_client.client_id
     *
     * @param clientId the value for oauth2_client.client_id
     * @author XuDong, Zhu
     * @date 2017 -02-22 16:19:34
     * @version 2.4.2
     * @mbggenerated
     */
    public void setClientId(String clientId) {
        this.clientId = clientId == null ? null : clientId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oauth2_client.client_secret
     *
     * @return the value of oauth2_client.client_secret
     * @author XuDong, Zhu
     * @date 2017 -02-22 16:19:34
     * @version 2.4.2
     * @mbggenerated
     */
    public String getClientSecret() {
        return clientSecret;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oauth2_client.client_secret
     *
     * @param clientSecret the value for oauth2_client.client_secret
     * @author XuDong, Zhu
     * @date 2017 -02-22 16:19:34
     * @version 2.4.2
     * @mbggenerated
     */
    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret == null ? null : clientSecret.trim();
    }
}