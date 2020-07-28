package com.panpan.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeetCode0009 {
    public static void main(String[] args) {
        int x = 10043424;
        boolean isPal = new LeetCode0009().isPalindrome(x);
        System.out.println(isPal);
    }
    /**
     * 计算一个数字是否是回文数
     * @param x
     * @return
     */
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;

        List<Integer> list = new ArrayList<>();

        while (x != 0){
            list.add(x % 10);
            x /= 10;
        }

        List<Integer> reversed = new ArrayList<Integer>();
        reversed.addAll(list);
        Collections.reverse(reversed);

        return list.equals(reversed);
    }
}
