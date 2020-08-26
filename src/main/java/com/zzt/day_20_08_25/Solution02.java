package com.zzt.day_20_08_25;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述：<br>题库 -- 算法 --【每日一题】491. 递增子序列
 * 网址：https://leetcode-cn.com/problems/increasing-subsequences/
 * </>
 *
 * @author 周志通
 * @version 1.0.0
 * @date 2020/8/25 23:15
 **/
public class Solution02 {

    public List<List<Integer>> findSubsequences(int[] nums) {

        return null;
    }

    public static void main(String[] args) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> res;
        int index = 3;
        int begin = (1 << index - 1) + 1;
        while (begin < (1 << index)) {
            res = new ArrayList<>();
            String s = Integer.toBinaryString(begin);
            for (char c : s.toCharArray()) {
                res.add((int) c - 48);
            }
            result.add(res);
            begin++;
        }
        System.out.println(result);
    }

}
