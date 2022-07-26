package com.leetcode.solution746;

import java.util.Arrays;

/*746. Min Cost Climbing Stairs
https://leetcode.com/problems/min-cost-climbing-stairs/
        You are given an integer array cost where cost[i] is the cost of ith step on a staircase.
        Once you pay the cost, you can either climb one or two steps.
        You can either start from the step with index 0, or the step with index 1.
        Return the minimum cost to reach the top of the floor.
*/
public class Solution746 {
    public int minCostClimbingStairs(int... cost) {
        int n = cost.length;
        int min = 0;
        int countSum = 0;

        while (cost.length > 0) {
            min = Math.min(cost[cost.length - 2], cost[cost.length - 1]);
            cost = Arrays.copyOf(cost, cost.length - 1);
            System.out.println(Arrays.toString(cost));
            System.out.println(min);
//            countSum = countSum + min;
            //      minCostClimbingStairs(cost);
        }
        countSum = countSum + min;
        // minCostClimbingStairs(cost);
        return countSum;
    }
}
