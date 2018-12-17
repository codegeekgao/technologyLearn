package com.codegeek.security.url;

import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * URL 编码demo
 */
public class URLDecode {

    public static void main(String[] args) throws Exception{
        String original ="https://我爱中国";
        String encodeStr= URLEncoder.encode(original,"UTF-8");
        System.out.println(encodeStr);

        System.out.println("----解码:"+ URLDecoder.decode(encodeStr,"UTF-8"));
    }
}
