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
            messageDigest = MessageDigest.getInstance("sha1");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        messageDigest.update(input);
        return messageDigest.digest();
    }
}
