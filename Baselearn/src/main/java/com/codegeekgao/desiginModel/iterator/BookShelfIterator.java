/**
 * zlc.com Inc.
 * Copyright (c) 2018-2018 All Rights Reserved.
 */
package com.codegeekgao.desiginModel.iterator;

/**
 * 书架迭代器
 *
 * @author codegeekgao
 * @version Id: BookShelfIterator.java, v 0.1 2018/12/25 0025 15:30 codegeekgao Exp $$
 */
public class BookShelfIterator implements Iterator {

    private BookShelf bookShelf;
    private int index;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < bookShelf.getLength();
    }

    @Override
    public Object next() {
        Book book = bookShelf.getBook(index);
        index++;
        return book;
    }
}