package com.codegeekgao.collection.hashtable;

import java.util.Hashtable;

/**
 * @author DonnieGao
 * @version Id: HashTableDemo.java, v 0.1 2018/5/16 下午5:49 DonnieGao Exp $$
 */
public class HashTableDemo {

    public static void main(String[] args) {
        Hashtable<String, Integer> hashTable = new Hashtable<>();
        hashTable.put("key1", 1);
        System.out.println(hashTable.elements().nextElement());
    }
}
