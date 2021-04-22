package com.library.entity.Vo;

/**
 * 消息模型对象（数据响应）
 * 状态码
 *     1 成功  0 失败
 * 提示信息
 *     字符串
 * 回显数据
 *     object
 * @author 扯淡
 */
public class MessageModel {

    private Integer code;
    private String msg;
    private Object object;

    public Integer getCode(){
        return code;
    }

    public void setCode(Integer code){
        this.code = code;
    }

    public String getMsg(){
        return msg;
    }

    public void setMsg(String msg){
        this.msg = msg;
    }

    public Object getObject(){
        return object;
    }

    public void setObject(Object object){
        this.object = object;
    }

}
