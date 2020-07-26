package com.panpan.leetcode;

public class LeetCode0007 {
    public static void main(String[] args) {
        int x = 1534236469;
        System.out.println(x);
        System.out.println(Integer.MAX_VALUE);
        //int res = new LeetCode0007().reverse(x);
        //System.out.println(res);
    }
    //TODO:待处理溢出问题
    public int reverse(int x) {
        boolean isNegtive = false;
        if (x < 0){
            isNegtive = true;
            x = -x;
        }

        int res = 0;

        while (x > 0){
            res  = res * 10 + x % 10;
            x = x / 10;
        }

        if (isNegtive)
            res = res * -1;
        return res;
    }

}
