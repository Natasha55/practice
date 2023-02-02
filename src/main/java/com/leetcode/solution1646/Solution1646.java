package com.leetcode.solution1646;
/*1646. Get Maximum in Generated Array
https://leetcode.com/problems/get-maximum-in-generated-array/description/
    You are given an integer n. A 0-indexed integer array nums of length n + 1
    is generated in the following way:
    nums[0] = 0
    nums[1] = 1
    nums[2 * i] = nums[i] when 2 <= 2 * i <= n
    nums[2 * i + 1] = nums[i] + nums[i + 1] when 2 <= 2 * i + 1 <= n
    Return the maximum integer in the array nums.
*/

import java.util.Arrays;

public class Solution1646 {
    public int getMaximumGenerated(int n) {
        int[] nums = new int[n + 1];
        int i;
        if ((n == 0) || (n == 1)) {
            i = n;
            return i;
        }
        nums[0] = 0;
        nums[1] = 1;
        for (i = 2; i <= n; i++) {
            if (i % 2 == 0) {
                nums[i] = nums[i / 2];
            } else {
                nums[i] = nums[i / 2] + nums[i / 2 + 1];
            }
        }
        Arrays.sort(nums);
        return nums[n];
    }

    public static void main(String[] args) {

        new Solution1646().getMaximumGenerated(0);
        new Solution1646().getMaximumGenerated(1);
        new Solution1646().getMaximumGenerated(2);
        new Solution1646().getMaximumGenerated(3);
        new Solution1646().getMaximumGenerated(7);
    }
}

