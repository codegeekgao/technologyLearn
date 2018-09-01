package com.codegeekgao.sort;

import java.util.Arrays;

/**
 * @author DonnieGao
 * @version Id: FastSort.java, v 0.1 2018/9/1 11:05 DonnieGao Exp $$
 */
public class FastSort {

    private static int partition(int[] arr, int startIndex, int endIndex) {
        int pivot = arr[startIndex];
        int left = startIndex;
        int right = endIndex;
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

    public static void sort(int[] arr, int startIndex, int endIndex) {
        // 递归结束条件：startIndex大等于endIndex的时候
        if (startIndex >= endIndex) {
            return;
        }
        // 得到基准元素位置
        int pivotIndex = partition(arr, startIndex, endIndex);
        // 用分治法递归数列的两部分
        sort(arr, startIndex, pivotIndex - 1);

        sort(arr, pivotIndex + 1, endIndex);
    }

    public static void main(String[] args) {
        int[] arr = {11, 55, 44, 20, 45, 16};
        sort(arr, 0, arr.length - 1);
        Arrays.stream(arr).forEach(System.out::println);
    }
}