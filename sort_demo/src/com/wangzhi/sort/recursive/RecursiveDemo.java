package com.wangzhi.sort.recursive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 递归调用的Demo
 * @author wangzhi
 */
public class RecursiveDemo {


    public static void main(String[] args) {
        // 测试计算一个集合所有元素的和（这里仅仅是测试递归，如果快速计算可以使用stream流）
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(9);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        // System.out.println("sumWithList : " + sumWithList(list));
        // 共享对象传递，这里输出移除后的结果
        // list.forEach(System.out::print);
        // System.out.println("lengthWithList: " + lengthWithList(list));
        System.out.println("maxWithList: " + maxWithList(list));


    }

    /**
     * 计算一个list中所有元素的和
     * @param list
     * @return
     */
    public static int sumWithList(List<Integer> list) {
        // 基准条件
        if (list.size() == 1) {
            return list.get(0);
        }
        // 递归条件
        return list.remove(0) + sumWithList(list);
    }

    /**
     * 递归计算集合的长度
     * @param list
     * @return
     */
    public static int lengthWithList(List<Integer> list) {
        if (list.size() == 1) {
            return 1;
        }
        list.remove(0);
        return 1 + lengthWithList(list);
    }

    /**
     * 递归得到集合中的最大值
     * @param list
     * @return
     */
    public static int maxWithList(List<Integer> list) {
        if (list.size() == 1) {
           return list.get(0);
        }
        Integer remove = list.remove(0);
        int max = maxWithList(list);
        if (remove > max) {
            return remove;
        } else {
            return max;
        }
    }
}
