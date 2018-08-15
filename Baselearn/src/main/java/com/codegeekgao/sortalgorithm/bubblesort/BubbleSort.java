package com.codegeekgao.sortalgorithm.bubblesort;

import java.util.Arrays;

/**
 * 冒泡排序算法
 *
 * @author DonnieGao
 * @version Id: BubbleSort.java, v 0.1 2018/8/15 上午9:37 DonnieGao Exp $$
 */
public class BubbleSort {

    /**
     * 测试算法排序
     *
     * @param args
     */
    public static void main(String[] args) {
        /**
         * 初始化数组
         */
        int[] arr = {22, 44, 12, 45, 66, 23, 15};
        BubbleSort.bubbleSort(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }

    /**
     * 原始冒泡排序算法
     * N个数字要排序完成，总共进行N-1趟排序，
     * 每i趟的排序次数为(N-i)次，所以可以用双重循环语句，
     * 外层控制循环多少趟，内层控制每一趟的循环次数
     *
     * @param arr
     */
    public static void bubbleSort(int[] arr) {
        // 定义交换变量
        int temp = 0;
        // 外层for循环表示(n-1)趟排序
        for (int i = 0; i < arr.length - 1; i++) {
            // 内循环表示一趟排序需要排序的次数，因最后一个是最大数值无需比较，所以这里-i
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
