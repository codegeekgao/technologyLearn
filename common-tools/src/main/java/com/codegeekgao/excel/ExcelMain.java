package com.codegeekgao.excel;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;

/**
 * ExcelMainTest
 *
 * @author codegeekgao
 * @version Id: ExcelMain.java, v 0.1 2018/11/5 15:55 codegeekgao Exp $$
 */
public class ExcelMain {

    public static void main(String[] args) throws Exception {
        // 创建Excel
        HSSFWorkbook hssfWorkbook = new HSSFWorkbook();
        // 创建一个工作表
        HSSFSheet sheet = hssfWorkbook.createSheet();
        // 设置列宽
        sheet.setColumnWidth(0, 5000);
        // 创建第一行
        HSSFRow row = sheet.createRow(0);
        // 创建第一行的第一个单元格
        for (int i=0 ;i<=3;i++) {
            HSSFCell cell = row.createCell(i);
            // 想单元格写值
            cell.setCellValue("测试"+i);
        }
        // 保存到本地
        hssfWorkbook.write(new FileOutputStream(new File("D://ops/a.xls")));
        // 关闭工作薄
        hssfWorkbook.close();
    }
}
