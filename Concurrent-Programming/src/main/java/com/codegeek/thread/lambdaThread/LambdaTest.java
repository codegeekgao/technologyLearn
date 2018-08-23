package com.codegeek.thread.lambdaThread;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author DonnieGao
 * @version Id: LambdaTest.java, v 0.1 2018/8/23 23:05 DonnieGao Exp $$
 */
public class LambdaTest {

    private static String[] arr = {"1", "2", "3", "4", "5"};
    private static List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

    public static void main(String[] args) {
        Stream<String> stream = Arrays.stream(arr);
        stream.forEach(System.out::print);
        System.out.println();
        int sum = list.parallelStream().mapToInt(value -> value).sum();
        System.out.println(sum);
    }
}