package com.leetcode.solution13;
/*13. Roman to Integer
https://leetcode.com/problems/roman-to-integer/
Symbol       Value
I             1         I can be placed before V (5) and X (10) to make 4 and 9.
V             5         X can be placed before L (50) and C (100) to make 40 and 90.
X             10        C can be placed before D (500) and M (1000) to make 400 and 900.
L             50        Given a roman numeral, convert it to an integer.
C             100
D             500
M             1000
        */

import java.util.Objects;

public class Solution13 {
    public int romanToInt(String s) {
        char[] array = s.toCharArray();
        int result = 0;
        for (int i = 0; i < array.length; i++) {

            if (array[i] == 'I') {
                result = result + 1;
            }

            if (array[i] == 'V') {
                if (((i - 1) >= 0) && (array[i - 1] == 'I')) {
                    result = result + 3;
                } else {
                    result = result + 5;
                }
            }
            if (array[i] == 'X') {
                if (((i - 1) >= 0) && (array[i - 1] == 'I')) {
                    result = result + 8;
                } else {
                    result = result + 10;
                }
            }
            if (array[i] == 'L') {
                if (((i - 1) >= 0) && (array[i - 1] == 'X')) {
                    result = result + 30;
                } else {
                    result = result + 50;
                }
            }
            if (array[i] == 'C') {
                if (((i - 1) >= 0) && (array[i - 1] == 'X')) {
                    result = result + 80;
                } else {
                    result = result + 100;
                }
            }
            if (array[i] == 'D') {
                if (((i - 1) >= 0) && (array[i - 1] == 'C')) {
                    result = result + 300;
                } else {
                    result = result + 500;
                }
            }
            if (array[i] == 'M') {
                if (((i - 1) >= 0) && (array[i - 1] == 'C')) {
                    result = result + 800;
                } else {
                    result = result + 1000;
                }
            }
        }
        System.out.println("RESULT FINAL: " + result);
        return result;
    }

    public static void main(String[] args) {
        new Solution13().romanToInt("III");
        System.out.println("RESULT must be: 3");

        new Solution13().romanToInt("LVIII");
        System.out.println("RESULT must be: 58");

        new Solution13().romanToInt("MCMXCIV");
        System.out.println("RESULT must be: 1994");

        new Solution13().romanToInt("IV");
        System.out.println("RESULT must be: 4");
    }
}
