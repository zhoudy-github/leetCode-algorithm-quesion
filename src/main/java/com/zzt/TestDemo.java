package com.zzt;

import java.util.Arrays;

/**
 * 描述：<br> 题库 -- 算法 --【每日一题】 415. 字符串相加
 * 网页地址：https://leetcode-cn.com/problems/add-strings/
 * <p>
 * 个人的理解思路：
 * <p>
 * 详细思路地址：
 * <p>
 * 问题的考点：
 * <p>
 * </>
 *
 * @author 周志通
 * @version 1.0.0
 * @date 2020/8/3 19:47
 **/
public class TestDemo {

    public static void main(String[] args) {
        int[] ins = {2, 3, 5, 1, 23, 6, 78, 34, 23, 4, 5, 78, 34, 65, 32, 65, 76, 32, 76, 1, 9};
        sort(ins);
        System.out.println(Arrays.toString(ins));
    }

    public static void sort(int[] ins) {
        int len = ins.length;
        int gap = len >> 2;
        int temp, j;
        while (gap > 0) {
            for (int i = gap; i < len; i++) {
                temp = ins[j=i];
                while (j - gap >= 0 && ins[j - gap] > ins[j]) {
                    ins[j] = ins[j -= gap];
                }
                ins[j] = temp;
            }
            gap >>= 1;
        }

    }

}
