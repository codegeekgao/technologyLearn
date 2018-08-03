package com.codegeekgao.mailtool.common;

import io.github.biezhi.ome.OhMyEmail;

import java.util.Properties;

/**
 * 常用工具类
 *
 * @author DonnieGao
 * @version Id: CommonUtil.java, v 0.1 2018/8/2 下午9:30 DonnieGao Exp $$
 */
public class CommonUtil {

    /**
     * 配置邮件
     *
     * @param smtpHost smtpHost
     * @param userName 邮件地址
     * @param password password
     */
    public static void configMail(String smtpHost, String userName, String password) {
        Properties properties = OhMyEmail.defaultConfig(false);
        properties.setProperty("mail.smtp.host", smtpHost);
        OhMyEmail.config(properties, userName, password);
    }

    /**
     * 拼接邮件发送模板
     *
     * @return
     */
    public static String content(String validateCode) {
        StringBuffer sb = new StringBuffer("点击下面链接激活账号，48小时生效，否则重新注册账号，链接只能使用一次，请尽快激活！</br>");
        sb.append("<a href=\"http://localhost:8080/springmvc/user/register?action=activate");
        sb.append("&validateCode=");
        sb.append(validateCode);
        sb.append("\">http://localhost:8080/springmvc/user/register?action=activate&email=");
        sb.append("&validateCode=");
        sb.append(validateCode);
        sb.append("</a>");
        return sb.toString();
    }

}
