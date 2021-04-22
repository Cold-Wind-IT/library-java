package com.library.entity;

import lombok.Data;

import java.sql.Date;

/**
 * @author 扯淡
 */
@Data
public class Record {

    private Integer idRecord;
    private String userCode;
    private String bookCode;
    private Date borrowTime;
    private Date returnTime;

}
