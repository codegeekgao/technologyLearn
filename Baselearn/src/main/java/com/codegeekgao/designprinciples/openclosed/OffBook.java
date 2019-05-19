package com.codegeekgao.designprinciples.openclosed;

import java.math.BigDecimal;

/**
 * @author codegeekgao
 * @version Id: OffBook.java, 2019/5/18 11:06 AM codegeekgao Exp $$
 */

public class OffBook extends ComputerBook {


    public OffBook(String pressName, BigDecimal price, String bookName) {
        super(pressName, price, bookName);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice();
    }
}
