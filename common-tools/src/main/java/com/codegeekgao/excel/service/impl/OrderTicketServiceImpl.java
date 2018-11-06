package com.codegeekgao.excel.service.impl;

import com.codegeekgao.excel.dao.OrderTicketMapper;
import com.codegeekgao.excel.model.OrderTicket;
import com.codegeekgao.excel.service.OrderTicketService;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author codegeekgao
 * @version Id: OrderTicketServiceImpl.java, v 0.1 2018/11/6 15:34 codegeekgao Exp $$
 */
@Service
public class OrderTicketServiceImpl implements OrderTicketService {

    @Autowired
    private OrderTicketMapper orderTicketMapper;

    @Override
    public List<OrderTicket> findAllTypeTicketSale(Map<String, Object> map) {
        return orderTicketMapper.findAllTypeTicketSale(map);
    }

    @Override
    public OrderTicket findTicketBySchemaId(String schemaId) {
        return orderTicketMapper.findTicketBySchemaId(schemaId);
    }

    @Override
    public void exportExcelAllTypeTicket(Map<String, Object> map) throws Exception {
        // 创建Excel
        HSSFWorkbook hssfWorkbook = new HSSFWorkbook();
        try {
            List<OrderTicket> allTypeTicketSale = orderTicketMapper.findAllTypeTicketSale(map);
            // 创建Excel
            hssfWorkbook = new HSSFWorkbook();
            // 创建一个工作表
            HSSFSheet sheet = hssfWorkbook.createSheet();
            hssfWorkbook.setSheetName(0, "FC_3D");
            // 设置列宽
            sheet.setColumnWidth(0, 5000);
            // 创建第一行
            HSSFRow row = sheet.createRow(0);
            HSSFCell cell0 = row.createCell(0);
            // 想单元格写值
            cell0.setCellValue("彩种");
            HSSFCell cell1 = row.createCell(1);
            // 想单元格写值
            cell1.setCellValue("票号");
            HSSFCell cell2 = row.createCell(2);
            // 想单元格写值
            cell2.setCellValue("订单");
            HSSFCell cell3 = row.createCell(3);
            // 想单元格写值
            cell3.setCellValue("票金额");
            HSSFCell cell4 = row.createCell(4);
            // 想单元格写值
            cell4.setCellValue("中奖");
            List<OrderTicket> fc_3D = allTypeTicketSale.stream().filter(orderTicket -> orderTicket.getLotteryType().equals("FC_3D")).collect(Collectors.toList());
            for (int i = 0; i < fc_3D.size(); i++) {
                OrderTicket orderTicket = allTypeTicketSale.get(i);
                        HSSFRow row1 = sheet.createRow(i + 1);
                        HSSFCell c0 = row1.createCell(0);
                        c0.setCellValue("FC_3D");
                        HSSFCell c1 = row1.createCell(1);
                        c1.setCellValue(orderTicket.getTicketId());
                        HSSFCell c2 = row1.createCell(2);
                        c2.setCellValue(orderTicket.getSchemaId());
                        HSSFCell c3 = row1.createCell(3);
                        c3.setCellValue(orderTicket.getPrice().doubleValue());
                        HSSFCell c4 = row1.createCell(4);
                        c4.setCellValue(orderTicket.getNetPrize().doubleValue());
            }
            // 保存到本地
            hssfWorkbook.write(new FileOutputStream(new File("D://ops/a.xls")));
        } finally {
            // 关闭工作薄
            hssfWorkbook.close();
        }
    }
}
