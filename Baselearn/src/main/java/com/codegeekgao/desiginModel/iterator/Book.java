/**
 * zlc.com Inc.
 * Copyright (c) 2018-2018 All Rights Reserved.
 */
package com.codegeekgao.desiginModel.iterator;

import lombok.Getter;
import lombok.ToString;

/**
 * 书
 *
 * @author codegeekgao
 * @version Id: Book.java, v 0.1 2018/12/25 0025 13:51 codegeekgao Exp $$
 */
@Getter
@ToString
public class Book {

    private String bookName;

    public Book(String bookName) {
        this.bookName = bookName;
    }

}