package com.codegeekgao.designprinciples.openclosed;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author codegeekgao
 * @version Id: ComputerBook.java, 2019/5/18 10:30 AM codegeekgao Exp $$
 */
@AllArgsConstructor
@NoArgsConstructor
public class ComputerBook implements Book {

    private String pressName;

    private BigDecimal price;

    private String bookName;


    /**
     * 获取出版社名
     */
    @Override
    public String getPressName() {
        return this.pressName;
    }

    /**
     * 获取价格
     */
    @Override
    public BigDecimal getPrice() {
        return this.price;
    }


    /**
     * 获取书名
     */
    @Override
    public String getBookName() {
        return this.bookName;
    }

    @Override
    public BigDecimal getActivityPrice(BigDecimal discount,BigDecimal activityPrice) {
        BigDecimal price = this.getPrice();
        BigDecimal disCountPrice = price.multiply(discount).setScale(1, BigDecimal.ROUND_HALF_UP);
        return price.compareTo(activityPrice) == 1 ? disCountPrice : price;
    }
}
