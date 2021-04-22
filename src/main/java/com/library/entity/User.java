package com.library.entity;

import lombok.Data;

import java.sql.Date;

/**
 * @author 扯淡
 */
@Data
public class User {

    private Integer idUser;
    /**
     * 学号、工号
     */
    private String userCode;
    /**
     * 姓名
     */
    private String userName;
    /**
     * 手机号
     */
    private String userNum;

    /**
     * 密码
     */
    private String userPwd;

}
