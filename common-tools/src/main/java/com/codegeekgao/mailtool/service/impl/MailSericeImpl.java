/**
 * Corearchi.com Inc.
 * Copyright (c) 2017-2018 All Rights Reserved.
 */
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
 * @version Id: MailSericeImpl.java, v 0.1 2018/8/2 下午9:14 DonnieGao Exp $$
 */
public class MailSericeImpl implements MailService {


    /**
     * 发送邮件
     */
    @Override
    public String sendMail() {
        // 配置邮件服务器连接
        CommonUtil.configMail(MailType.SMTP_163.getMail(), "codegeek_mrgao@163.com", "123123");
        try {
            OhMyEmail.subject("可安用户注册")
                    .from("可安官方邮件")
                    .to("707252730@qq.com")
                    .text(CommonUtil.content("123456"))
                    .send();
        } catch (MessagingException e) {
            e.printStackTrace();
            return "false";
        }

        return "success";
    }
}
