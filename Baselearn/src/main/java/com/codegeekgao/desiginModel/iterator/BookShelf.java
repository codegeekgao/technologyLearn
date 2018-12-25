/**
 * zlc.com Inc.
 * Copyright (c) 2018-2018 All Rights Reserved.
 */
package com.codegeekgao.desiginModel.iterator;

/**
 * 书架
 *
 * @author codegeekgao
 * @version Id: BookShelf.java, v 0.1 2018/12/25 0025 13:55 codegeekgao Exp $$
 */
public class BookShelf implements Aggreagte {

    private Book[] books;
    private int last = 0;

    public BookShelf(int maxSize) {
        this.books = new Book[maxSize];
    }

    public Book getBookAt(int index) {
        return books[index];
    }

    public void appendBook(Book book) {
        this.books[last] = book;
        last++;
    }

    public int getBookNumber() {
        return last;
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}