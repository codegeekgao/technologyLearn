package com.codegeekgao.generic;

/**
 * @author codegeekgao
 * @version Id: GenericClass.java, 2019/5/17 8:28 PM codegeekgao Exp $$
 */
public class GenericClass {


    public static < T extends Comparable<T> > T getInt(T[] a) {
        return a[0].compareTo(a[1]) == 0 ? a[0] : a[1];
    }

    public static void main(String[] args) {
        String[] arr = {"1", "3"};
        System.out.println(getInt(arr));
    }

}
