package com.leetcode.solution746;

/*746. Min Cost Climbing Stairs
https://leetcode.com/problems/min-cost-climbing-stairs/
        You are given an integer array cost where cost[i] is the cost of ith step on a staircase.
        Once you pay the cost, you can either climb one or two steps.
        You can either start from the step with index 0, or the step with index 1.
        Return the minimum cost to reach the top of the floor.
*/
public class Solution746 {
    public int minCostClimbingStairs(int... cost) {
        int[] a = cost;
        int min;
        int countSum = 0;
        for (int i = 0; i <= cost.length - 2; i++) {
            if (i == 0) {
                if (a[i] < a[i + 1]) {
                    min = a[i];
                } else {
                    min = a[i + 1];
                }
            } else {
                if (a[i] == a[i + 1]) {
                    min = a[i + 1];
                }
                if (a[i] < a[i + 1]) {
                    min = a[i];
                } else {
                    min = a[i + 1];
                    i++;
                }
            }

            System.out.println(min);
            countSum = countSum + min;
            System.out.println("whaat " + countSum);
        }
        return countSum;
    }
}
