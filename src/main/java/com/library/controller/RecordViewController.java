package com.library.controller;

import com.library.entity.Book;
import com.library.entity.Record;
import com.library.entity.RecordView;
import com.library.entity.Vo.MessageModel;
import com.library.service.RecordViewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 扯淡
 */
@RestController
@CrossOrigin(origins = "*",maxAge = 3600)
public class RecordViewController {

    @Autowired
    private RecordViewRepository recordViewRepository;

    @GetMapping("/getRecord")
    public MessageModel getRecord(){
        MessageModel res = new MessageModel();
        List<RecordView> list = recordViewRepository.getRecord();
        if(list == null){
            res.setCode(0);
            res.setMsg("获取失败！");
            res.setObject(null);
        }
        else{
            res.setCode(1);
            res.setMsg("获取成功！");
            res.setObject(list);
        }
        return res;
    }

    /**
     * 借阅图书
     *
     * */
    @PostMapping("/recordSave")
    public MessageModel recordSave(@RequestBody Record record){
        MessageModel res = new MessageModel();
        Integer save = recordViewRepository.recordSave(record);
        if(save == 1){
            res.setCode(1);
            res.setMsg("借书成功！");
            res.setObject(save);
        }
        else{
            res.setCode(0);
            res.setMsg("借书失败！");
            res.setObject(null);
        }
        return res;
    }

    /**
     * 归还图书
     *
     * */
    @PostMapping("/recordUpdate")
    public MessageModel recordUpdate(@RequestBody Record record){
        MessageModel res = new MessageModel();
        Integer save = recordViewRepository.recordUpdate(record);
        if(save == 1){
            res.setCode(1);
            res.setMsg("还书成功！");
            res.setObject(save);
        }
        else{
            res.setCode(0);
            res.setMsg("还书失败！");
            res.setObject(null);
        }
        return res;
    }

}
