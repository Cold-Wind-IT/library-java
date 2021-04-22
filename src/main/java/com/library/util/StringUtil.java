package com.library.util;

/**
 * 判断字符串是否为空
 * 如果为空，返回true
 * 如果不为空，返回false
 * @author 扯淡
 */
public class StringUtil {

    public static boolean isEmpty(String str){
        if(str == null || "".equals(str.trim())){
            return true;
        }
        return false;
    }

}
