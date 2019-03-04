package com.codegeekgao.Rcode;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;

/**
 * @author codegeekgao
 * @version Id: CreateCode.java, v 0.1 2018/10/30 10:15 codegeekgao Exp $$
 */
public class CreateCode {
    public static void main(String[] args) {
        int width = 300;
        int height = 300;
        String format = "png";
        String content = "http://zunlong.oss-cn-zhangjiakou.aliyuncs.com/android/goodLuck/app-release.apk";
        //定义二维码的参数
        HashMap map = new HashMap();
        //设置编码
        map.put(EncodeHintType.CHARACTER_SET, "utf-8");
        //设置纠错等级
        map.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.M);
        map.put(EncodeHintType.MARGIN, 2);

        try {
            //生成二维码
            BitMatrix bitMatrix = new MultiFormatWriter().encode(content, BarcodeFormat.QR_CODE, width, height);
            Path file = new File("/Users/codegeekgao/Desktop/1.png").toPath();
            MatrixToImageWriter.writeToPath(bitMatrix, format, file);
        } catch (WriterException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
