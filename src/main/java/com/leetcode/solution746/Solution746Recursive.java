package com.leetcode.solution746;

/*746. Min Cost Climbing Stairs
https://leetcode.com/problems/min-cost-climbing-stairs/
        You are given an integer array cost where cost[i] is the cost of ith step on a staircase.
        Once you pay the cost, you can either climb one or two steps.
        You can either start from the step with index 0, or the step with index 1.
        Return the minimum cost to reach the top of the floor.
*/
public class Solution746Recursive {

    public int minCostClimbingStairs(int... cost) {
        return Math.min(minCostClimbingStairsR(cost.length - 1, cost),
                minCostClimbingStairsR(cost.length - 2, cost));
    }

    private int minCostClimbingStairsR(int n, int... cost) {
        if (n < 0) {
            return 0;
        }
        return Math.min(minCostClimbingStairsR(n - 2, cost),
                minCostClimbingStairsR(n - 1, cost)) + cost[n];
    }

    // Status: Time Limit Exceeded

}