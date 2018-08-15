package com.codegeekgao.springupload;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.UUID;

/**
 * 文件上传工具类
 *
 * @author DonnieGao
 * @version Id: UploadUtil.java, v 0.1 2018/8/8 下午11:53 DonnieGao Exp $$
 */
@Slf4j
public class UploadUtil {

    /**
     * spring上传文件,并返回文件的上传路径
     *
     * @param request
     * @return
     */
    public static String upLoadFile(HttpServletRequest request) {
        long startTime = System.currentTimeMillis();
        //将当前上下文初始化给  CommonsMultipartResolver （多部分解析器）
        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(
                request.getSession().getServletContext());
        StringBuffer sb = new StringBuffer("");
        //检查form中是否有enctype="multipart/form-data"
        if (multipartResolver.isMultipart(request)) {
            //将request变成多部分request
            MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
            //获取multiRequest中所有的文件名
            Iterator iterator = multiRequest.getFileNames();
            String usage = multiRequest.getParameter("usage");
            while (iterator.hasNext()) {
                //一次遍历所有文件
                MultipartFile file = multiRequest.getFile(iterator.next().toString());
                if (file != null) {
                    try {
                        String originalFilename = file.getOriginalFilename();

                        // 获取上传文件后缀名
                        String suffix = originalFilename.substring(originalFilename.lastIndexOf("."));
                        String fileName = getRandomFileName(suffix, usage);

                        // 拼接多个随机的文件名称,以"_"隔开
                        sb.append(fileName).append("_");
                        // 获取配置的上传文件路径
                        String pathName = "/home/upload";

                        File dir = new File(pathName);
                        if (!dir.exists()) {
                            dir.mkdirs();
                        }
                        String path = dir + "/" + fileName;
                        //上传
                        file.transferTo(new File(path));
                    } catch (Exception e) {
                        log.error("上传文件失败,异常信息={}", e);
                        return "";
                    }
                }
            }
        }
        long endTime = System.currentTimeMillis();
        log.info("上传文件消耗时间为:{}", endTime - startTime);
        return sb.toString();
    }

    /**
     * 上传文件生成随机文件名
     *
     * @return 日期+随机字母数字
     */
    public static String getRandomFileName(String suffix, String usage) {
        // 获得当前时间
        DateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
        // 转换为字符串
        String formatDate = format.format(new Date());
        // 随机生成文件编号
        String random = UUID.randomUUID().toString().replace("-", "").substring(0, 2);
        return new StringBuffer(usage).append(formatDate).append(
                random).append(suffix).toString();
    }
}
