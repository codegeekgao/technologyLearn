package com.codegeek.arraysoft;

import java.util.Arrays;

/**
 * @author DonnieGao
 * @version Id: ArrayDemo.java, v 0.1 2018/5/7 上午11:53 DonnieGao Exp $$
 */
public class ArrayDemo {

    public static void main(String[] args) {
        int[] arr = {11, 33, 22, 44, 45, 32, 25};
        // bubblesoft(arr);
        // Arrays.stream(arr).forEach(System.out::println);

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        Arrays.stream(arr).forEach(System.out::println);

        String str = "123";
        String st = new String("123");

        // false
        System.out.println(st == str);
    }

    /**
     * 冒泡排序
     *
     * @param arr
     */
    private static void bubblesoft(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // 小的前面.大的后面
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
