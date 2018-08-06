package com.codegeekgao.mailtool.enums;

/**
 * @author DonnieGao
 * @version Id: MailType.java, v 0.1 2018/8/2 下午10:09 DonnieGao Exp $$
 */
public enum MailType {

    // qq邮箱配置
    SMTP_QQ("qq邮箱", "smtp.qq.com"),
    //网易邮箱
    SMTP_163("网易163邮箱", "smtp.163.com");

    /**
     * 类型
     */
    private String host;
    /**
     * 描述信息
     */
    private String mail;

    MailType(String host, String mail) {
        this.host = host;
        this.mail = mail;
    }

    public String getHost() {
        return host;
    }


    public String getMail() {
        return mail;
    }


}
