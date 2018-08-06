package com.codegeekgao.mailtool.service.impl;

import com.codegeekgao.mailtool.common.CommonUtil;
import com.codegeekgao.mailtool.enums.MailType;
import com.codegeekgao.mailtool.service.MailService;
import io.github.biezhi.ome.OhMyEmail;

import javax.mail.MessagingException;

/**
 * 邮箱注册验证服务
 *
 * @author DonnieGao
 * @version Id: MailServiceImpl.java, v 0.1 2018/8/2 下午9:14 DonnieGao Exp $$
 */
public class MailServiceImpl implements MailService {


    /**
     * 发送邮件
     */
    @Override
    public String sendMail(String email) {
        // 配置邮件服务器连接
        CommonUtil.configMail(MailType.SMTP_163.getMail(), "codegeek_mrgao@163.com", "12");
        try {
            OhMyEmail.subject("可安用户注册激活")
                    .from("来自可安官方邮件服务")
                    .to(email)
                    .html(CommonUtil.content("123456", email))
                    .send();
        } catch (MessagingException e) {
            e.printStackTrace();
            return "false";
        }

        return "success";
    }
}
