package com.leetcode.solution322;

/*322. Coin Change
https://leetcode.com/problems/coin-change/
    You are given an integer array representing coins of different denominations and
    an integer representing a total amount of money.coins amount

    Return the fewest number of coins that you need to make up that amount.
    If that amount of money cannot be made up by any combination of the coins, return .-1
    You may assume that you have an infinite number of each kind of coin.
*/
import java.util.Arrays;

public class Solution322 {
    public int coinChange(int[] coins, int amount) {
        int[] current = new int[amount + 1];
        Arrays.fill(current, amount + 1);
        current[0] = 0;

        if (amount == 0) {
            return 0;
        }

        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (coin <= i) {
                    current[i] = Math.min(current[i], current[i - coin] + 1);
                }
            }
        }
        return current[amount] > amount ? -1 : current[amount];
    }
}
