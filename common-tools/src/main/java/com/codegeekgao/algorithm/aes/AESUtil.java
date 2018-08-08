package com.codegeekgao.algorithm.aes;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.AlgorithmParameters;

/**
 * AES加密工具
 *
 * @author DonnieGao
 * @version Id: AESUtil.java, v 0.1 2018/3/6 10:29 luojitao Exp $$
 */
public class AESUtil {

    //默认的加密算法
    public static final String DEFAULT_CIPHER_ALGORITHM = "AES/CBC/PKCS5Padding";
    //默认的密文传输方式
    public static final String DEFAULT_ALGORITHM_PARAMETER = "AES";

    //IV值，字节长度必须为16位
    public static final String DEFAULT_IVPARAMETER = "0190602030405040";

    public static final String algorithm = "MD5";

    /**
     * 加密
     *
     * @param content 需要加密的内容
     * @return
     * @throws Exception
     */
    public static byte[] encrypt(String content, String key) throws Exception {
        SecretKeySpec keySpec = getKey(key);
        Cipher cipher = Cipher.getInstance(DEFAULT_CIPHER_ALGORITHM);
        IvParameterSpec iv = new IvParameterSpec(getIV());
        //使用加密模式初始化 密钥
        cipher.init(Cipher.ENCRYPT_MODE, keySpec, iv);
        byte[] encrypted = cipher.doFinal(content.getBytes());
        return encrypted;
    }

    /**
     * @return
     */
    public static byte[] getIV() {
        String str = DEFAULT_IVPARAMETER;
        return str.getBytes();
    }

    /**
     * 解密
     *
     * @param content 需要解密的内容
     * @return
     * @throws Exception
     */
    public static String decrypt(byte[] content, String key) throws Exception {
        SecretKeySpec keySpec = getKey(key);
        //创建密码器
        Cipher cipher = Cipher.getInstance(DEFAULT_CIPHER_ALGORITHM);
        AlgorithmParameters.getInstance(DEFAULT_ALGORITHM_PARAMETER);
        IvParameterSpec iv = new IvParameterSpec(getIV());
        cipher.init(Cipher.DECRYPT_MODE, keySpec, iv);
        byte[] original = cipher.doFinal(content);
        String originalString = new String(original);
        return originalString;
    }

    /**
     * 获取加密key
     *
     * @param strKey AES密钥
     * @return
     * @throws Exception
     */
    private static SecretKeySpec getKey(String strKey) throws Exception {
        byte[] arrBTmp = strKey.getBytes();
        // 创建一个空的16位字节数组（默认值为0）
        byte[] arrB = new byte[16];

        for (int i = 0; i < arrBTmp.length && i < arrB.length; i++) {
            arrB[i] = arrBTmp[i];
        }

        SecretKeySpec keySpec = new SecretKeySpec(arrB, "AES");

        return keySpec;
    }

    /**
     * base 64 encode
     *
     * @param bytes 待编码的byte[]
     * @return 编码后的base 64 code
     */
    public static String base64Encode(byte[] bytes) {
        return new BASE64Encoder().encode(bytes);
    }

    /**
     * base 64 decode
     *
     * @param base64Code 待解码的base 64 code
     * @return 解码后的byte[]
     * @throws Exception
     */
    public static byte[] base64Decode(String base64Code) throws Exception {
        return base64Code.isEmpty() ? null : new BASE64Decoder().decodeBuffer(base64Code);
    }

    /**
     * AES加密为base 64 code
     *
     * @param content 待加密的内容
     * @return 加密后的base 64 code
     * @throws Exception
     */
    public static String aesEncrypt(String content, String key) throws Exception {
        return base64Encode(encrypt(content, key));
    }

    /**
     * 将base 64 code AES解密
     *
     * @param encryptStr 待解密的base 64 code
     * @return 解密后的string
     * @throws Exception
     */
    public static String aesDecrypt(String encryptStr, String key) throws Exception {
        return encryptStr.isEmpty() ? null : decrypt(base64Decode(encryptStr), key);
    }
}