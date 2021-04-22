package com.library.controller;

import com.library.entity.Book;
import com.library.entity.Vo.MessageModel;
import com.library.service.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 扯淡
 */
@RestController
@CrossOrigin(origins = "*",maxAge = 3600)
public class BookController {
    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/findAll")
    public MessageModel findAll(){
        MessageModel res = new MessageModel();
        List<Book> list = bookRepository.findAll();
        if(list == null){
            res.setCode(0);
            res.setMsg("查询失败！");
            res.setObject(null);
        }
        else{
            res.setCode(1);
            res.setMsg("查询成功！");
            res.setObject(list);
        }
        return res;
    }

    @GetMapping("/findByQuery")
    public MessageModel findByQuery(@RequestBody String bookQuery){
        MessageModel res = new MessageModel();
        List<Book> list = bookRepository.findByQuery(bookQuery);
        if(list == null){
            res.setCode(0);
            res.setMsg("查询失败！");
            res.setObject(null);
        }
        else{
            res.setCode(1);
            res.setMsg("查询成功！");
            res.setObject(list);
        }
        return res;
    }

    @PostMapping("/bookSave")
    public MessageModel save(@RequestBody Book book){
        MessageModel res = new MessageModel();
        Integer save = bookRepository.bookSave(book);
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

    @PutMapping("/bookUpdate")
    public MessageModel bookUpdate(@RequestBody Book book){

        MessageModel res = new MessageModel();
        Integer update = bookRepository.bookUpdate(book);
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

    @DeleteMapping("/bookDelete")
    public MessageModel bookDelete(@RequestBody Long idBook){
        MessageModel res = new MessageModel();
        Integer delete = bookRepository.bookDelete(idBook);
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

    @GetMapping("/getBookView")
    public MessageModel getBookView(){
        MessageModel res = new MessageModel();
        List<Book> list = bookRepository.getBookView();
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

    @PostMapping("/findByCode")
    public Book findByCode(@RequestBody String bookCode){
        return bookRepository.findByCode(bookCode);
    }

}
