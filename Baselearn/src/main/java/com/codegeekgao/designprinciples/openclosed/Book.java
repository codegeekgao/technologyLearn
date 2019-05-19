package com.codegeekgao.designprinciples.openclosed;


import java.math.BigDecimal;

public interface Book {
    /**
     * 获取出版社名
     */
    String getPressName();

    /**
     * 获取价格
     */
    BigDecimal getPrice();

    /**
     * 书名
     */
    String getBookName();

    BigDecimal getActivityPrice(BigDecimal discount,BigDecimal activityPrice);
}
