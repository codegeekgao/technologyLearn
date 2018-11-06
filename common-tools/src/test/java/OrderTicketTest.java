import com.codegeekgao.excel.model.OrderTicket;
import com.codegeekgao.excel.service.OrderTicketService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.Map;

/**
 * @author codegeekgao
 * @version Id: OrderTicketTest.java, v 0.1 2018/11/6 15:36 codegeekgao Exp $$
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-extra.xml")
public class OrderTicketTest {

    @Autowired
    private OrderTicketService orderTicketService;
    @Test
    public void test() {
        OrderTicket ticketBySchemaId = orderTicketService.findTicketBySchemaId("2018031711595631421000018");
        System.out.println(ticketBySchemaId);
    }

    @Test
    public void test1() throws Exception {
        Map<String,Object> map = new HashMap<>(0);
        map.put("ticketStatus","3");
        map.put("startTime","2018-09-27 18:00:00");
        map.put("endTime","2018-11-01");
        orderTicketService.exportExcelAllTypeTicket(map);
    }
}
