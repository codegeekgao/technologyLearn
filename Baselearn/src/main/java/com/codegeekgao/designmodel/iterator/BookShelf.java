/**
 * zlc.com Inc.
 * Copyright (c) 2018-2018 All Rights Reserved.
 */
package com.codegeekgao.designmodel.iterator;

/**
 * 书架，一个书架可以包含多个书
 *
 * @author codegeekgao
 * @version Id: BookShelf.java, v 0.1 2018/12/25 0025 15:24 codegeekgao Exp $$
 */
public class BookShelf implements Aggreate {

    private Book[] books;
    private int last = 0;

    // 通过构造函数初始化定义Book[index]
    public BookShelf(int maxsize) {
        this.books = new Book[maxsize];
    }

    public void appendBook(Book book) {
        this.books[last] = book;
        last++;
    }

    public int getLength() {
        return last;
    }

    public Book getBook(int index) {
        return this.books[index];
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}