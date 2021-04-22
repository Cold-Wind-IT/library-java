package com.library.entity;

import lombok.Data;

import java.sql.Date;

/**
 * @author 扯淡
 */
@Data
public class RecordView {

    private String bookCode;
    private String bookName;
    private String userCode;
    private String userName;
    private Date borrowTime;
    private Date returnTime;

}
