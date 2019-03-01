package com.codegeek.httpclient;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

/**
 * httpClient小试牛刀
 *
 * @author CodeGeekGao
 * @version Id: HttpClientDemo.java, v 0.1 2018/9/18 22:18 CodeGeekGao Exp $$
 */
public class HttpClientDemo {

    public static void main(String[] args) throws Exception {
        //  对于URL必须使用 http://开始，否则会有报错信息：org.apache.http.ProtocolException: Target host is not specified
        String url = "http://alipay.yzn98.com/alipayTransfer/recharge/orderNo.htm?orderNo=201111180317101&licenseCode=BB4CAF60377966474F4F82048120B566";
        // 默认的HttpClient已经过时
        HttpClient httpClient = HttpClientBuilder.create().build();
        HttpGet httpGet = new HttpGet(url);
        // 获得响应
        HttpResponse response = httpClient.execute(httpGet);
        HttpEntity entity = response.getEntity();
        byte[] bytes = EntityUtils.toByteArray(entity);
        System.out.println(new String(bytes, "UTF-8"));
    }
}
