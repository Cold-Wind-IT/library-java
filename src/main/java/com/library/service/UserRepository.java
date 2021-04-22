package com.library.service;

import com.library.entity.User;

import java.util.List;

/**
 * @author 扯淡
 */
public interface UserRepository {

    /**
     * 查询所有用户信息
     *
     * @return
     * @param
     */
    public List<User> getAllUser();

    /**
     * 登录验证
     *
     * @param user
     * @return
     */
    public User userLogin(User user);

    /**
     * 修改用户信息
     *
     * @return
     * @param user
     */
    public Integer userUpdate(User user);

    /**
     * 新增用户信息
     *
     * @return
     * @param user
     */
    public Integer userSave(User user);

    /**
     * 根据id编号删除用户信息
     *
     * @return
     * @param idUser
     */
    public Integer userDelete(Integer idUser);

}
