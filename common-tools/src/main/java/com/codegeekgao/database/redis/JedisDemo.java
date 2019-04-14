package com.codegeekgao.database.redis;

import redis.clients.jedis.Jedis;

import java.util.Set;

/**
 * @author codegeekgao
 * @version Id: JedisDemo.java, 2019/4/13 2:55 PM codegeekgao Exp $$
 */
public class JedisDemo {

    public static void main(String[] args) {
        // 创建Jedis连接
        Jedis jedis = new Jedis("10.211.55.9",6379);
        Set<String> keys = jedis.keys("*h*");
        keys.forEach(e-> System.out.println(e));
        jedis.close();
    }
}
