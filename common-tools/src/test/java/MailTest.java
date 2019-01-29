import com.codegeekgao.algorithm.md5.Md5SaltTool;
import com.codegeekgao.mailtool.service.MailService;
import com.codegeekgao.mailtool.service.impl.MailServiceImpl;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

/**
 * @author DonnieGao
 * @version Id: MailTest.java, v 0.1 2018/8/2 下午10:29 DonnieGao Exp $$
 */
public class MailTest {


    @Test
    public void test() {
        MailService service = new MailServiceImpl();
        System.out.println(service.sendMail("7"));
    }

    @Test
    public void testUser() throws UnsupportedEncodingException, NoSuchAlgorithmException {
        String password = "password";
        String encryptedPwd = Md5SaltTool.getEncryptedPwd(password);
        System.out.println();
        System.out.println(encryptedPwd);
        System.out.println();
        boolean b = Md5SaltTool.validPassword("123", encryptedPwd);
        System.out.println(b);
    }


    @Test
    public void testDigest()  {
     //   Validate.isTrue(StringUtils.isNoneEmpty(""), "input should not be empty", "");
        System.out.println(DigestUtils.sha1Hex("huangsubing"));
    }
}
