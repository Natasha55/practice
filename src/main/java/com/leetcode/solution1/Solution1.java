package com.leetcode.solution1;
/*1. Two Sum
https://leetcode.com/problems/two-sum/
    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    You may assume that each input would have exactly one solution, and you may not use the same element twice.
    You can return the answer in any order.
    Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
    Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]
    Example 3:
Input: nums = [3,3], target = 6
Output: [0,1]
 */

import java.util.Arrays;

class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        int[] newNums = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j > i; j--) {
                if (nums[i] + nums[j] == target) {
                    newNums[0] = i;
                    newNums[1] = j;
                }
            }
        }
        System.out.println(Arrays.toString(newNums));
        return newNums;
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 2, 4};
        new Solution1().twoSum(nums1, 6);

        int[] nums2 = {3, 3};
        new Solution1().twoSum(nums2, 6);

        int[] nums3 = {2,7,11,15};
        new Solution1().twoSum(nums3, 9);
    }
}


