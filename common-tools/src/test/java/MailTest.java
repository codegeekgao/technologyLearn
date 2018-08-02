/**
 * Corearchi.com Inc.
 * Copyright (c) 2017-2018 All Rights Reserved.
 */

import com.codegeekgao.mailtool.service.MailService;
import com.codegeekgao.mailtool.service.impl.MailSericeImpl;
import org.junit.Test;

/**
 * @author gaoxinpeng
 * @version Id: MailTest.java, v 0.1 2018/8/2 下午10:29 gaoxinpeng Exp $$
 */
public class MailTest {


    @Test
    public void test() {
        MailService service = new MailSericeImpl();
        System.out.println(service.sendMail());
    }
}
