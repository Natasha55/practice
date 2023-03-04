package com.leetcode.solution136;
/*136. Single Number
    Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
    You must implement a solution with a linear runtime complexity and use only constant extra space.
 */

import java.util.Arrays;

public class Solution136 {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);

        if (nums.length == 1) {
            System.out.println("Result: " + nums[0]);
            return nums[0];
        }
        for (int i = 1; i < nums.length; i += 2) {
            if (nums[i] != nums[i - 1]) {
                System.out.println("Result: " + nums[i - 1]);
                return nums[i - 1];
            }
        }
        System.out.println("Result: " + nums[nums.length - 1]);
        return nums[nums.length - 1];
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{2, 2, 1};
        new Solution136().singleNumber(nums1);
        System.out.println("Need OUTPUT :" + "1");

        int[] nums2 = new int[]{4, 1, 2, 1, 2};
        new Solution136().singleNumber(nums2);
        System.out.println("Need OUTPUT :" + "4");

        int[] nums3 = new int[]{1};
        new Solution136().singleNumber(nums3);
        System.out.println("Need OUTPUT :" + "1");
    }
}



