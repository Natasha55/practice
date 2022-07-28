package com.leetcode.solution746;

public class Fibonacci {
    /*
     *   F(0) = 1
     *   F(1) = 1
     *   F(n) = F(n-1) + F(n-2)
     */
    int recursive(int n, int level) {
        System.out.println("level = " + level + " => n = " + n);
        if (n <= 1) {
            return 1;
        }
        return recursive(n - 1, level + 1) + recursive(n - 2, level + 1);
    }

    int iterative(int n) {
        int[] f = new int[n + 1];
        f[0] = 1;
        f[1] = 1;

        int i = 2;
        while (i < n + 1) {
            f[i] = f[i - 1] + f[i - 2];
            i++;
        }
        return f[n];
    }

    public static void main(String[] args) {
        Fibonacci fb = new Fibonacci();

        System.out.println("result recursive = " + fb.recursive(5, 0));
        System.out.println("result iterative = " + fb.iterative(5));
    }
}
