package com.wangzhi.sort.quick;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 快速排序
 * @author wangzhi
 */
public class QuickSort {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 5, 8, 3, 4, 2, 9, 0, 14, 12, 16, 18, 20);
        integers = quickWithList(integers);
        integers.forEach(System.out::println);

    }


    /**
     * 快速排序的实现
     * @param list
     * @return
     */
    public static List<Integer> quickWithList(List<Integer> list) {
        if (list.size() == 1 || list.size() == 0) {
            return list;
        }
        int middleIndex = list.size() / 2;
        List<Integer> minList = new ArrayList<>();
        List<Integer> maxList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (middleIndex != i) {
                if (list.get(middleIndex) > list.get(i)) {
                    minList.add(list.get(i));
                } else {
                    maxList.add(list.get(i));
                }
            }
        }
        List<Integer> result = new ArrayList<>();
        result.addAll(quickWithList(minList));
        result.add(list.get(middleIndex));
        result.addAll(quickWithList(maxList));
        return result;
    }
}
