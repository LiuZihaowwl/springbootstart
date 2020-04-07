package com.example.demo.po;

import javax.persistence.*;

@Table(name = "user")
public class User {
    @Id
    private Integer id;

    @Column(name = "user_name")
    private String userName;

    private String pasword;

    private String salt;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return user_name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * @return pasword
     */
    public String getPasword() {
        return pasword;
    }

    /**
     * @param pasword
     */
    public void setPasword(String pasword) {
        this.pasword = pasword == null ? null : pasword.trim();
    }

    /**
     * @return salt
     */
    public String getSalt() {
        return salt;
    }

    /**
     * @param salt
     */
    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }
}
