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
        // BubbleSort.bubbleSort(arr);
        BubbleSort.optimizeBubbleSoft(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }

    /**
     * 原始冒泡排序算法
     * N个数字要排序完成，总共进行N-1趟排序，
     * 每i趟的排序次数为(N-i)次，所以可以用双重循环语句，
     * 外层控制循环多少趟，内层控制每一趟的循环次数
     * 冒泡排序的优点：每进行一趟排序，就会少比较一次，因为每进行一趟排序都会找出一个较大值。
     * 如上例：第一趟比较之后，排在最后的一个数一定是最大的一个数，
     * 第二趟排序的时候，只需要比较除了最后一个数以外的其他的数
     * 同样也能找出一个最大的数排在参与第二趟比较的数后面，
     * 第三趟比较的时候，只需要比较除了最后两个数以外的其他的数，以此类推……也就是说，
     * 没进行一趟比较，每一趟少比较一次，一定程度上减少了算法的量。
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

    /**
     * 优化冒泡排序，若某一趟没有进行排序直接结束循环
     */
    public static void optimizeBubbleSoft(int[] arr) {
        // 定义交换变量
        int temp = 0;
        // 定义标记
        boolean onChange = false;
        for (int i = 0; i < arr.length - 1; i++) {
            // 内循环表示一趟排序需要排序的次数，因最后一个是最大数值无需比较，所以这里-i
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    onChange = true;
                }
            }

            if (!onChange) {
                break;
            }
        }
    }

    /**
     * 鸡尾酒排序
     *
     * @param arr
     */
    public static void cocktailSort(int[] arr) {
        int i, temp, left = 0, right = arr.length - 1;
        while (left < right) {
            for (i = left; i < right; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            right--;
            for (i = right; i > left; i--) {
                if (arr[i - 1] > arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                }
            }
            left++;
        }
    }

}
