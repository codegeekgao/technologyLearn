import com.codegeekgao.mailtool.service.MailService;
import com.codegeekgao.mailtool.service.impl.MailServiceImpl;
import org.junit.Test;

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
}
