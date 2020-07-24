package com.panpan.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode0003 {

    public static void main(String[] args) {
        int ans = new LeetCode0003().lengthOfLongestSubstring("abcdaed");

        System.out.println(ans);
    }

    public int lengthOfLongestSubstring(String s) {
        //用于存储最后一次看到某个字符是在什么位置
        Map<Character, Integer> lastPos = new HashMap<>();
        int i =0, ans = 0;

        for (int j = 0; j < s.length(); j++){
            if (lastPos.containsKey(s.charAt(j))){
                i = Math.max(lastPos.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i +1 );
            lastPos.put(s.charAt(j), j+1);
        }

        return ans;
    }
}
