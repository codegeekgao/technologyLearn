package com.codegeekgao.excel.model;

import lombok.Data;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 票
 *
 * @author codegeekgao
 * @version Id: OrderTicket.java, v 0.1 2018/11/6 14:38 codegeekgao Exp $$
 */
@Data
public class OrderTicket {
    private int pkSid;
    private String ticketId;
    private String detailId;
    private String schemaId;
    private String vendorId;
    private String lotteryType;
    private String drawSeq;
    private String gameTypeId;
    private String payslip;
    private String times;
    private String bets;
    /*单注金额： 大乐透追加单注3元 普通2元*/
    private String unitPrice;
    private BigDecimal price;
    private String ticketNumber;
    private String ticketSp;
    private String ticketSpDelay;
    private int liquidation;
    private int ticketStatus;
    private int exceptionStatus;
    private String ticketFailedCode;
    private String ticketFailedMessage;
    private String prizeStatus;
    private String printTicketTime;
    private BigDecimal grossPrize;
    private BigDecimal netPrize;
    private BigDecimal actualPrize;
    private Date createTime;
    private Date sendSuccessTime;
    private Date updateTime;
    private Date printDeadline;
    private int actualPrizeStatus;
    private String passType;
    private int version;
    private String winStatus;
}
