package com.library.controller;

import com.library.entity.Admin;
import com.library.entity.Vo.MessageModel;
import com.library.service.AdminRepository;
import com.library.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 扯淡
 */
@RestController
@CrossOrigin(origins = "*",maxAge = 3600)
public class AdminController {
    @Autowired
    private AdminRepository adminRepository;

    @PostMapping("/adminLogin")
    public MessageModel adminLogin(@RequestBody Admin admin){
        MessageModel res = new MessageModel();
        Admin resAdmin = adminRepository.adminLogin(admin);
        if(resAdmin == null){
            res.setCode(0);
            res.setMsg("登录失败！");
            res.setObject(null);
        }
        else{
            res.setCode(1);
            res.setMsg("登录成功！");
            res.setObject(resAdmin);
        }
        return res;
    }
}
