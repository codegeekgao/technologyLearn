package com.codegeek.security.base64;


import java.util.Base64;

/**
 * base64:将一种二进制数据用文本表示的算法
 */
public class BaseEncode {

    public static void main(String[] args) throws Exception {
        // 字节数组按照每6位一个分组，对应16进制数字通过查询Base64编码表
        String original = "中国";
        String base64Str = Base64.getEncoder().encodeToString(original.getBytes());
        System.out.println(base64Str);
        System.out.println(new String(Base64.getDecoder().decode(base64Str), "UTF-8"));
    }
}
