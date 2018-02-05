package com.m2m.domain;

import java.util.Date;

public class User {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.uid
     *
     * @mbg.generated Thu Jan 18 10:54:32 CST 2018
     */
    private Long uid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_name
     *
     * @mbg.generated Thu Jan 18 10:54:32 CST 2018
     */
    private String userName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.encrypt
     *
     * @mbg.generated Thu Jan 18 10:54:32 CST 2018
     */
    private String encrypt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.salt
     *
     * @mbg.generated Thu Jan 18 10:54:32 CST 2018
     */
    private String salt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.create_time
     *
     * @mbg.generated Thu Jan 18 10:54:32 CST 2018
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.update_time
     *
     * @mbg.generated Thu Jan 18 10:54:32 CST 2018
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.status
     *
     * @mbg.generated Thu Jan 18 10:54:32 CST 2018
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.touristType
     *
     * @mbg.generated Thu Jan 18 10:54:32 CST 2018
     */
    private Integer touristtype;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.disable_user
     *
     * @mbg.generated Thu Jan 18 10:54:32 CST 2018
     */
    private Integer disableUser;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.uid
     *
     * @return the value of user.uid
     *
     * @mbg.generated Thu Jan 18 10:54:32 CST 2018
     */
    public Long getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.uid
     *
     * @param uid the value for user.uid
     *
     * @mbg.generated Thu Jan 18 10:54:32 CST 2018
     */
    public void setUid(Long uid) {
        this.uid = uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_name
     *
     * @return the value of user.user_name
     *
     * @mbg.generated Thu Jan 18 10:54:32 CST 2018
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_name
     *
     * @param userName the value for user.user_name
     *
     * @mbg.generated Thu Jan 18 10:54:32 CST 2018
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.encrypt
     *
     * @return the value of user.encrypt
     *
     * @mbg.generated Thu Jan 18 10:54:32 CST 2018
     */
    public String getEncrypt() {
        return encrypt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.encrypt
     *
     * @param encrypt the value for user.encrypt
     *
     * @mbg.generated Thu Jan 18 10:54:32 CST 2018
     */
    public void setEncrypt(String encrypt) {
        this.encrypt = encrypt == null ? null : encrypt.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.salt
     *
     * @return the value of user.salt
     *
     * @mbg.generated Thu Jan 18 10:54:32 CST 2018
     */
    public String getSalt() {
        return salt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.salt
     *
     * @param salt the value for user.salt
     *
     * @mbg.generated Thu Jan 18 10:54:32 CST 2018
     */
    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.create_time
     *
     * @return the value of user.create_time
     *
     * @mbg.generated Thu Jan 18 10:54:32 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.create_time
     *
     * @param createTime the value for user.create_time
     *
     * @mbg.generated Thu Jan 18 10:54:32 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.update_time
     *
     * @return the value of user.update_time
     *
     * @mbg.generated Thu Jan 18 10:54:32 CST 2018
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.update_time
     *
     * @param updateTime the value for user.update_time
     *
     * @mbg.generated Thu Jan 18 10:54:32 CST 2018
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.status
     *
     * @return the value of user.status
     *
     * @mbg.generated Thu Jan 18 10:54:32 CST 2018
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.status
     *
     * @param status the value for user.status
     *
     * @mbg.generated Thu Jan 18 10:54:32 CST 2018
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.touristType
     *
     * @return the value of user.touristType
     *
     * @mbg.generated Thu Jan 18 10:54:32 CST 2018
     */
    public Integer getTouristtype() {
        return touristtype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.touristType
     *
     * @param touristtype the value for user.touristType
     *
     * @mbg.generated Thu Jan 18 10:54:32 CST 2018
     */
    public void setTouristtype(Integer touristtype) {
        this.touristtype = touristtype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.disable_user
     *
     * @return the value of user.disable_user
     *
     * @mbg.generated Thu Jan 18 10:54:32 CST 2018
     */
    public Integer getDisableUser() {
        return disableUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.disable_user
     *
     * @param disableUser the value for user.disable_user
     *
     * @mbg.generated Thu Jan 18 10:54:32 CST 2018
     */
    public void setDisableUser(Integer disableUser) {
        this.disableUser = disableUser;
    }
}