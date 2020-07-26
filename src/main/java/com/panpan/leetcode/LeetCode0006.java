package com.panpan.leetcode;

public class LeetCode0006 {

    public static void main(String[] args) {
        String s = "A";
        int numRows = 5;

        String res = new LeetCode0006().convert(s, numRows);
        System.out.println(res);
    }

    /**
     * Z字形打印字符串
     * 思路：
     *     计算字符属于哪一行，然后串起来就可以了
     * @param s
     * @param numRows
     * @return
     */
    public String convert(String s, int numRows) {
        if (numRows < 2)
            return s;

        StringBuilder[] stringBuilders = new StringBuilder[numRows];
        for (int i = 0; i < numRows;i++) stringBuilders[i] = new StringBuilder();

        for (int i = 0; i < s.length();i++){
            if (i % (2*numRows -2) < numRows){
                int row = i % (2 * numRows - 2);
                stringBuilders[row].append(s.charAt(i));
            } else {
                int row = (2*numRows-2) - (i % (2 *numRows -2));
                stringBuilders[row].append(s.charAt(i));
            }
        }

        StringBuilder res = new StringBuilder();
        for (int i=0; i < numRows; i ++){
            res.append(stringBuilders[i]);
        }

        return res.toString();
    }
}