/**
 * zlc.com Inc.
 * Copyright (c) 2018-2018 All Rights Reserved.
 */
package com.codegeekgao.desiginModel.iterator;

/**
 * @author codegeekgao
 * @version Id: IteratorMain.java, v 0.1 2018/12/25 0025 15:36 codegeekgao Exp $$
 */
public class IteratorMain {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("嘻嘻"));
        bookShelf.appendBook(new Book("哈哈"));
        bookShelf.appendBook(new Book("嘿嘿"));
        bookShelf.appendBook(new Book("呵呵"));
        Iterator iterator = bookShelf.iterator();
        while (iterator.hasNext()) {
            Book next = (Book) iterator.next();
            System.out.println(next);
        }
    }
}