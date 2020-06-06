package com.wangzhi.algorithm;

import java.util.Arrays;
import java.util.List;

/**
 * 二分查找Demo
 * @author wangzhi
 */
public class BinarySearchDemo {


    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Integer result = binarySearch(list, 2);
        Integer result1 = binarySearch(list, 11);
        System.out.println("1 == " + result);
        System.out.println("null : " + result1);
    }

    /**
     * 二分查找方法: 时间复杂度 O(log n)  n就是数组或者集合的长度
     *  2^x = n,这里的x就是查找的次数
     * @param list 已经排过序的集合
     * @param num  查找的数
     * @return  返回结果： 找到返回索引；找不到返回null
     */
    public static Integer binarySearch(List<Integer> list, Integer num) {
        int low = 0;
        int high = list.size() - 1;

        while(low < high) {
            int mid = (low + high) / 2;
            if(list.get(mid) > num) {
                high = mid - 1;
            } else if(list.get(mid) < num) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return null;
    }
}
