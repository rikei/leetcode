package com.panpan.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 思路：遍历数组，取每一个数字num1，在剩余数组里查找num2 = target-num1, 如果找到则返回
 */
public class LeetCode0001 {
    public static void main(String[] args) {
        int[] result = new LeetCode0001().twoSum2(new int[]{2, 7, 11, 15}, 9);
        System.out.println(Arrays.toString(result));
    }

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++)
        {
            int remain = target - nums[i];

            for (int j = i+1; j < nums.length;j++)
            {
                if (remain == nums[j]){
                    //找到结果
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{-1, -1};
    }

    /**
     * 使用hashmap 提高存储效率
     * key = 值， value = 索引
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length;i++){
            int remain = target - nums[i];
            if (map.containsKey(remain)){
                return new int[]{map.get(remain), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{-1, -1};
    }
}
