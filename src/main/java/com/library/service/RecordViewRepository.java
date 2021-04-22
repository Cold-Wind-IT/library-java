package com.library.service;

import com.library.entity.Record;
import com.library.entity.RecordView;

import java.util.List;

/**
 * @author 扯淡
 */
public interface RecordViewRepository {

    /**
     * 查询所有借还信息视图
     *
     * @return
     * @param
     */
    public List<RecordView> getRecord();

    /**
     * 新增借书记录
     *
     * @param record
     * @return
     */
    public Integer recordSave(Record record);

    /**
     * 更新还书时间
     *
     * @param record
     * @return
     */
    public Integer recordUpdate(Record record);

}
