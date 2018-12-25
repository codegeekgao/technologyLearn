/**
 * zlc.com Inc.
 * Copyright (c) 2018-2018 All Rights Reserved.
 */
package com.codegeekgao.desiginModel.iterator;

/**
 * 书架迭代器 1、访问一个聚合对象的内容而无须暴露它的内部表示。 2、需要为聚合对象提供多种遍历方式。 3、为遍历不同的聚合结构提供一个统一的接口。
 *
 * @author codegeekgao
 * @version Id: BookShelfIterator.java, v 0.1 2018/12/25 0025 14:19 codegeekgao Exp $$
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
        if (index < bookShelf.getBookNumber()) {
            return true;
        } else return false;
    }

    @Override
    public Object next() {
        Book bookAt = bookShelf.getBookAt(index);
        index++;
        return bookAt;
    }
}