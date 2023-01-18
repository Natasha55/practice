package com.leetcode.solution9;
/*9. Palindrome Number
https://leetcode.com/problems/palindrome-number/
    Given an integer x, return true if x is a palindrome, and false otherwise.
 */

import java.util.Arrays;

public class Solution9 {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        } else {
            int count = 0;
            char[] chars = String.valueOf(x).toCharArray();
            char[] chars1 = new char[chars.length];
            for (int i = chars.length - 1; i >= 0; i--) {
                chars1[count] = chars[i];
                count++;
            }
            return Arrays.equals(chars, chars1);
        }
    }

    public static void main(String[] args) {
        new Solution9().isPalindrome(121);
        new Solution9().isPalindrome(-121);
        new Solution9().isPalindrome(10);
    }
}
