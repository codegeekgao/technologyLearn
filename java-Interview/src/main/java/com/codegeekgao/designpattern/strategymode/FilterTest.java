/**
 * Corearchi.com Inc.
 * Copyright (c) 2017-2018 All Rights Reserved.
 */
package com.codegeekgao.designpattern.strategymode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author DonnieGao
 * @version Id: FilterTest.java, v 0.1 2018/8/28 上午9:43 DonnieGao Exp $$
 */
public class FilterTest {

    private static List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    public static void main(String[] args) {
        List<Integer> integerList = getNum(integers, new MyfilterImpl());
        integerList.forEach(System.out::println);

        integers.stream().filter(i -> i > 5).forEach(System.out::println);

    }

    public static List<Integer> getNum(List<Integer> integers, MyFilter<List<Integer>> listMyFilter) {
        List<Integer> integer = new ArrayList<>();
        if (listMyFilter.getWant(integers)) {
            integer.addAll(integers);
        }

        return integer;
    }
}
