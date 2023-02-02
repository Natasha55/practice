package com.leetcode.solution344;

import java.util.Arrays;
import java.util.Collections;

/*344. Reverse String
https://leetcode.com/problems/reverse-string/
    Write a function that reverses a string. The input string is given as an array of characters .s
    You must do this by modifying the input array in-place with extra memory.O(1)

 */
public class Solution344 {
    public void reverseString(char[] s) {
        int first = 0;
        int last = s.length - 1;
        char temp;

        while (first <= last) {
            temp = s[first];
            s[first] = s[last];
            s[last] = temp;
            first++;
            last--;
        }
        System.out.println(Arrays.toString(s));
    }

    public static void main(String[] args) {
        char[] s = new char[]{'h', 'e', 'l', 'l', 'o'};
        new Solution344().reverseString(s);
        System.out.println("MUST print: " + "[o, l, l, e, h]");

        char[] s2 = new char[]{'H', 'a', 'n', 'n', 'a', 'h'};
        new Solution344().reverseString(s2);
        System.out.println("MUST print: " + "[h, a, n, n, a, H]");
    }
}
