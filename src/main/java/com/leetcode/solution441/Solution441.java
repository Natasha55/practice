package com.leetcode.solution441;
/*441. Arranging Coins
https://leetcode.com/problems/arranging-coins/description/
    You have n coins and you want to build a staircase with these coins.
    The staircase consists of k rows where the ith row has exactly i coins.
    The last row of the staircase may be incomplete.
    Given the integer n, return the number of complete rows of the staircase you will build.
 */

public class Solution441 {
    public int arrangeCoins(int n) {

        int cont = 0;
        int result = 0;
        while (n > cont) {
            n = n - cont;
            cont++;
            if (n < cont) {
                break;
            }
            result = cont;
        }
        return result;
    }

    public static void main(String[] args) {
        new Solution441().arrangeCoins(5);
        System.out.println("RESULT must be: 2");

        new Solution441().arrangeCoins(8);
        System.out.println("RESULT must be: 3");
    }
}
