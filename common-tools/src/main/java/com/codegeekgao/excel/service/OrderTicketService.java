package com.codegeekgao.excel.service;

import com.codegeekgao.excel.model.OrderTicket;

import java.util.List;
import java.util.Map;

/**
 * @author codegeekgao
 * @version Id: OrderTicketService.java, v 0.1 2018/11/6 15:32 codegeekgao Exp $$
 */
public interface OrderTicketService {

    List<OrderTicket> findAllTypeTicketSale(Map<String,Object> map);

    OrderTicket findTicketBySchemaId(String schemaId);

    void exportExcelAllTypeTicket(Map<String,Object> map) throws Exception;
}
