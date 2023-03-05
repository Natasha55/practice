package com.leetcode.solution414;

import java.util.Arrays;

/*414. Third Maximum Number
https://leetcode.com/problems/third-maximum-number/
    Given an integer array nums, return the third distinct maximum number in this array.
    If the third maximum does not exist, return the maximum number.
 */
public class Solution414 {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        int result = 0;
        int[] copy = new int[]{};

        // delete duplicate
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                nums[count++] = nums[i];
            }
            copy = Arrays.copyOf(nums, count);
        }

        if (copy.length >= 3) {
            result = copy[copy.length - 3];
        }
        if (copy.length == 2) {
            result = copy[1];
        }
        if (copy.length == 1) {
            result = copy[0];
        }

        System.out.println(Arrays.toString(copy));
        System.out.println(result);
        return result;
    }


    public static void main(String[] args) {
        int[] nums1 = new int[]{3, 2, 1};
        new Solution414().thirdMax(nums1);
        System.out.println("Right answer:" + 1);

        int[] nums2 = new int[]{1, 2};
        new Solution414().thirdMax(nums2);
        System.out.println("Right answer:" + 1);

        int[] nums3 = new int[]{2, 2, 3, 1};
        new Solution414().thirdMax(nums3);
        System.out.println("Right answer:" + 1);
    }
}
