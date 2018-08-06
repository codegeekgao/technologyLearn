package com.codegeekgao.mailtool.service;

/**
 * 验证注册service
 *
 * @author DonnieGao
 * @version Id: MailService.java, v 0.1 2018/8/2 下午9:08 DonnieGao Exp $$
 */
public interface MailService {

    /**
     * 发送邮箱
     * @param email 用户邮箱
     * @return
     */
    String sendMail(String email);

}