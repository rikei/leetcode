package com.panpan.leetcode;

import com.panpan.leetcode.common.BooleanUtil;

import java.util.HashMap;
import java.util.Map;

public class LeetCode0004 {
    public static void main(String[] args) {
//        String s = "afsafsdabcdedcbaaaaa";
        String s = "ab";

        String res = new LeetCode0004().longestPalindrome(s);
        System.out.println(res);
    }
    public String longestPalindrome(String s) {
        int len = s.length();
        int begin = 0; //回文起始位置
        int maxLen = 1; //回文最大长度，一个字符肯定是回文

        //只有一个字符
        if (len < 2)
            return s;

        //dp[i][j]表示s[i..j]是否是回文
        boolean[][] dp = new boolean[len][len];

        //初始化对角线，表示只有一个字符肯定是回文了
        for (int i = 0; i < s.length(); i++){
            dp[i][i] = true;
        }

        char[] charArray = s.toCharArray();
        //注意左下角先填
        for (int j = 0; j < s.length(); j++){
            for (int i =0 ;i < j; i++){
                if (charArray[i] != charArray[j]){
                    dp[i][j] = false;
                } else {
                    if (j - i < 3) {
                        dp[i][j] = true;
                    }
                    else {
                        dp[i][j] = dp[i+1][j-1];
                    }
                }

                //只有dp[i][j] = true, 表示s[i..j]是回文，记录其实位置和长度
                if (dp[i][j] == true && j - i + 1 > maxLen){
                    maxLen = j - i + 1;
                    begin = i;
                }
            }
        }
        BooleanUtil.printBoolleanArray(dp, len, len);
        return s.substring(begin, begin + maxLen);
    }
}
