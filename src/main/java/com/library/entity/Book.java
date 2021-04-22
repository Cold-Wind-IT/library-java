package com.library.entity;

import lombok.Data;


/**
 * @author 扯淡
 */
@Data
public class Book {

    private Long idBook;
    private String bookName;
    private String bookCode;
    private String bookQuery;
    private String bookAuthor;
    private String bookPublishName;
    private Integer bookPublishYear;
    private String bookPrice;
    private Integer bookNum;
    private Integer bookBorrowed;
    private String categoryCode;
    private String categoryName;

}
