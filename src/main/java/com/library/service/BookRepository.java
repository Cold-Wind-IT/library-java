package com.library.service;

import com.library.entity.Book;

import java.util.List;

/**
 * @author 扯淡
 */
public interface BookRepository {

    /**
     * 查询所有图书信息
     *
     * @return
     * @param
     */
    public List<Book> findAll();

    /**
     * 通过图书条码查询图书信息
     *
     * @param bookCode
     * @return
     */
    public Book findByCode(String bookCode);

    /**
     * 添加图书信息
     *
     * @param book
     * @return
     */
    public Integer bookSave(Book book);

    /**
     * 修改图书信息
     *
     * @param book
     * @return
     */
    public Integer bookUpdate(Book book);

    /**
     * 根据图书编号删除图书信息
     *
     * @param idBooks
     * @return
     */
    public Integer bookDelete(Long idBooks);

    /**
     * 搜索图书信息
     *
     * @param bookQuery
     * @return
     */
    public List<Book> findByQuery(String bookQuery);

    /**
     * 获取图书视图信息
     *
     * @param
     * @return
     */
    public List<Book> getBookView();

    /**
     * 借阅图书
     *
     * @param book
     * @return
     */
    public Integer bookBorrow(Book book);

    /**
     * 归还图书
     *
     * @param book
     * @return
     */
    public Integer bookReturn(Book book);

}
