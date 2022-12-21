package com.leetcode.solution242;
/*242. Valid Anagram
https://leetcode.com/problems/valid-anagram/
    Given two strings s and t, return true if t is an anagram of s, and false otherwise.
    An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
    typically using all the original letters exactly once.
 */

import java.util.Arrays;

public class Solution242 {
    public boolean isAnagram(String s, String t) {
        char[] sLetters = s.toCharArray();
        Arrays.sort(sLetters);
        char[] tLetters = t.toCharArray();
        Arrays.sort(tLetters);
        return Arrays.equals(sLetters, tLetters);
    }

    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        new Solution242().isAnagram(s, t);

        s = "rat";
        t = "car";
        new Solution242().isAnagram(s, t);
    }
}
