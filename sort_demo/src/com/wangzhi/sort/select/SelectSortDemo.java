package com.wangzhi.sort.select;

/**
 * 选择排序
 * @author wangzhi
 */
public class SelectSortDemo {

    public static void main(String[] args) {
        int[] arr = new int[]{3,5,1,4,8,6,9,2,7,0};
        arr = selectSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static int[] selectSort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int i1 = i + 1; i1 < arr.length; i1++) {
                if (arr[i] > arr[i1]) {
                   temp = arr[i];
                   arr[i] = arr[i1];
                   arr[i1] = temp;
                }
            }
        }
        return arr;
    }


}
