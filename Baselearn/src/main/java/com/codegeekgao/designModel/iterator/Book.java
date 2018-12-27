/**
 * zlc.com Inc.
 * Copyright (c) 2018-2018 All Rights Reserved.
 */
package com.codegeekgao.designModel.iterator;

import lombok.Setter;
import lombok.ToString;

/**
 * 书
 *
 * @author codegeekgao
 * @version Id: Book.java, v 0.1 2018/12/25 0025 15:23 codegeekgao Exp $$
 */
@Setter
@ToString
public class Book {

    private String name;

    public Book(String name) {
        this.name = name;
    }
}