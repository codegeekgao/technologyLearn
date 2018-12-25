/**
 * zlc.com Inc.
 * Copyright (c) 2018-2018 All Rights Reserved.
 */
package com.codegeekgao.desiginModel.iterator;

/**
 * @author codegeekgao
 * @version Id: IteratorClient.java, v 0.1 2018/12/25 0025 14:32 codegeekgao Exp $$
 */
public class IteratorClient {

    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("java入门经典"));
        bookShelf.appendBook(new Book("Spring入门经典"));
        bookShelf.appendBook(new Book("SpringBoot入门经典"));
        bookShelf.appendBook(new Book("SpringCloud入门经典"));
        Iterator it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book= (Book) it.next();
            System.out.println(book);
        }
    }
}