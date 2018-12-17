package com.codegeek.security.md5;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * 摘要算法
 */
public class Md5Encode {


    public static void main(String[] args) {
        // hash若一致则称发生了碰撞
        System.out.println("abc".hashCode() == "xyz".hashCode());
        /**
         * 摘要算法：MD5，SHA-1，SHA-256
         */
        /**
         * 彩虹表MD5 不能直接MD5可以加盐，保证相对安全
         */
        try {
            // 16进制数目
            System.out.println(String.format("%32x",new BigInteger(1,Md5Encode("haha123".getBytes("UTF-8")))));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    private static byte[] Md5Encode(byte[] input) {
        MessageDigest messageDigest = null;
        try {
            messageDigest = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        messageDigest.update(input);
        return messageDigest.digest();
    }
}
