package com.codegeekgao.sortalgorithm.fastsort;

import java.util.Arrays;

/**
 * 快速排序实现
 *
 * @author DonnieGao
 * @version Id: FastSort.java, v 0.1 2018/8/16 下午9:58 DonnieGao Exp $$
 */
public class FastSort {

    private static int partition(int[] arr, int startIndex, int endIndex) {
        // 取第一个元素作为基准元素
        int pivot = arr[startIndex];
        int left = startIndex;
        int right = endIndex;
        // 坑的位置，初始等于pivot位置
        int index = startIndex;

        while (right >= left) {

            while (right >= left) {
                if (arr[right] < pivot) {
                    arr[left] = arr[right];
                    index = right;
                    left++;
                    break;
                }
                right--;
            }

            while (right >= left) {
                if (arr[left] > pivot) {
                    arr[right] = arr[left];
                    index = left;
                    right--;
                    break;
                }
                left++;
            }
        }
        arr[index] = pivot;
        return index;
    }

    public static void quickSort(int[] arr, int startIndex, int endIndex) {
        // 递归结束条件：startIndex大等于endIndex的时候
        if (startIndex >= endIndex) {
            return;
        }
        // 得到基准元素位置
        int pivotIndex = partition(arr, startIndex, endIndex);
        // 用分治法递归数列的两部分
        quickSort(arr, startIndex, pivotIndex - 1);

        quickSort(arr, pivotIndex + 1, endIndex);
    }

    public static void main(String[] args) {
        int[] arr = {11, 55, 44, 20, 45, 16};
        quickSort(arr, 0, arr.length - 1);
        Arrays.stream(arr).forEach(System.out::println);
    }
}
