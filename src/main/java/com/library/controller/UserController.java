package com.library.controller;

import com.library.entity.User;
import com.library.entity.Vo.MessageModel;
import com.library.service.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 扯淡
 */
@RestController
@CrossOrigin(origins = "*",maxAge = 3600)
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/userLogin")
    public MessageModel userLogin(@RequestBody User user){
        MessageModel res = new MessageModel();
        User resUser =  userRepository.userLogin(user);
        if(resUser == null){
            res.setCode(0);
            res.setMsg("登录失败！");
            res.setObject(null);
        }
        else{
            res.setCode(1);
            res.setMsg("登录成功！");
            res.setObject(resUser);
        }
        return res;
    }

    @GetMapping("/getAllUser")
    public MessageModel getAllUser(){
        MessageModel res = new MessageModel();
        List<User> userList = userRepository.getAllUser();
        if(userList == null){
            res.setCode(0);
            res.setMsg("查询失败！");
            res.setObject(null);
        }
        else{
            res.setCode(1);
            res.setMsg("查询成功！");
            res.setObject(userList);
        }
        return res;
    }

    @PutMapping("/userUpdate")
    public MessageModel userUpdate(@RequestBody User user){
        MessageModel res = new MessageModel();
        Integer update = userRepository.userUpdate(user);
        if(update == 0){
            res.setCode(0);
            res.setMsg("修改失败！");
            res.setObject(null);
        }
        else{
            res.setCode(1);
            res.setMsg("修改成功！");
            res.setObject(update);
        }
        return res;
    }

    @PostMapping("/userSave")
    public MessageModel userSave(@RequestBody User user){
        MessageModel res = new MessageModel();
        Integer save = userRepository.userSave(user);
        if(save == 0){
            res.setCode(0);
            res.setMsg("新增失败！");
            res.setObject(null);
        }
        else{
            res.setCode(1);
            res.setMsg("新增成功！");
            res.setObject(save);
        }
        return res;
    }

    @DeleteMapping("/userDelete")
    public MessageModel userDelete(@RequestBody Integer idUser){
        MessageModel res = new MessageModel();
        Integer delete = userRepository.userDelete(idUser);
        if(delete == 0){
            res.setCode(0);
            res.setMsg("删除失败！");
            res.setObject(null);
        }
        else{
            res.setCode(1);
            res.setMsg("删除成功！");
            res.setObject(delete);
        }
        return res;
    }

}
