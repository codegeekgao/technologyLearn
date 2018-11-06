package com.codegeekgao.excel.dao;

import com.codegeekgao.excel.model.OrderTicket;

import java.util.List;
import java.util.Map;

/**
 * @author codegeekgao
 * @version Id: OrderTicketMapper.java, v 0.1 2018/11/6 15:06 codegeekgao Exp $$
 */
public interface OrderTicketMapper {

    List<OrderTicket> findAllTypeTicketSale(Map<String,Object> map);

    OrderTicket findTicketBySchemaId(String ticketId);
}
