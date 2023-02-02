package com.leetcode.solution746;

public class Solution746Iteration {

    public int minCostClimbingStairs(int... cost) {
        int n = cost.length;
        int[] pays = new int[n];
        pays[0] = cost[0];
        pays[1] = cost[1];

        int i = 2;
        while (i < n) {
            pays[i] = Math.min(pays[i - 2], pays[i - 1]) + cost[i];
            i++;
        }

        return Math.min(pays[n - 1], pays[n - 2]);
    }

    public static void main(String[] args) {
        new Solution746Recursive().minCostClimbingStairs(10, 15, 20);
        new Solution746Recursive().minCostClimbingStairs(1, 100, 1, 1, 1, 100, 1, 1, 100, 1);
        new Solution746Iteration().minCostClimbingStairs(10, 15, 20);
        new Solution746Iteration().minCostClimbingStairs(1, 100, 1, 1, 1, 100, 1, 1, 100, 1);
    }
}
