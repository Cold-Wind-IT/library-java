package com.library.service;

import com.library.entity.Admin;

import java.util.List;

/**
 * @author 扯淡
 */
public interface AdminRepository {

    /**
     * 管理员登录验证
     *
     * @return
     * @param admin
     * */
    public Admin adminLogin(Admin admin);

}
