package com.leetcode.solution70;
/*70. Climbing Stairs
https://leetcode.com/problems/climbing-stairs/description/
    You are climbing a staircase. It takes n steps to reach the top.
    Each time you can either climb 1 or 2 steps. In how many
    distinct ways can you climb to the top?
        */
public class Solution70 {
        public int climbStairs(int n) {

            if (n <= 3) {
                return n;
            }
            int val1 = 1;
            int val2 = 1;

            for (int i = 1; i < n; i++) {
                int current = val1 + val2;
                val1 = val2;
                val2 = current;
            }
            return val2;
        }
    }

