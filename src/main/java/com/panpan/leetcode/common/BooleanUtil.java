package com.panpan.leetcode.common;

public class BooleanUtil {
    public static void printBoolleanArray(boolean[][] arrays, int nLine, int nColumn){
        for (int i = 0 ; i < nLine; i++){
            for (int j = 0; j < nColumn; j++){
                System.out.print(arrays[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
