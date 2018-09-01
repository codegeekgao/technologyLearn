package com.codegeekgao.sort;

/**
 * 快速排序
 *
 * @author DonnieGao
 * @version Id: BubbleSort.java, v 0.1 2018/9/1 10:57 DonnieGao Exp $$
 */
public class BubbleSort {

    public static void main(String[] args) {

    }

    public static void bubbleSort(int[] arr) {
        int temp = 0;
        boolean change = false;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    change = true;
                }
            }

            if (!change) {
                break;
            }
        }
    }
}