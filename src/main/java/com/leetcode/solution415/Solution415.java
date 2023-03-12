package com.leetcode.solution415;
/*415. Add Strings
https://leetcode.com/problems/add-strings/description/
    Given two non-negative integers, and represented as string,
    return the sum of and as a string.num1num2num1num2.
    You must solve the problem without using any built-in library for handling large integers (such as ).
    You must also not convert the inputs to integers directly.BigInteger.
 */

import java.sql.SQLOutput;
import java.util.Arrays;

public class Solution415 {
    public String addStrings(String num1, String num2) {
        char[] array1 = num1.toCharArray();
        char[] array2 = num2.toCharArray();
        char[] array1FirstPart = new char[array1.length / 2];
        char[] array1SecondPart = new char[array1.length / 2];
        char[] array2FirstPart = new char[array2.length / 2];
        char[] array2SecondPart = new char[array2.length / 2];
        int start = 0;
        int middle = 0;
        String str = null;
        if ((array1.length <= 6) && (array2.length <= 6)) {

            long number1 = Long.valueOf(String.valueOf(array1));
            long number2 = Long.valueOf(String.valueOf(array2));
            str = Long.toString(number1 + number2);
            System.out.println("Result: " + str);
            return str;

//        } else {
//            if (array1.length > array2.length) {
//                for (int i = 0; array1.length - 1 > i; i++) {
//                    int mid = array1.length / 2;
//                    for (int j = 0; j <= mid-1; j++) {
//                        array1FirstPart[start] = array1[j];
//                        start++;
//                    }
//                    start = 0;
//                    for (int k = mid; k <= array1.length - 1; k++) {
//                        array1SecondPart[start] = array1[k];
//                        start++;
//                    }
//                    start = 0;
//                }
//                System.out.println("First array: ");
//                System.out.println(Arrays.toString(array1FirstPart));
//                System.out.println(Arrays.toString(array1SecondPart));
//
//                for (int i = 0; array2.length - 1 > i; i++) {
//                    int mid = array1.length / 2;
//                    middle = mid;
//                    for (int j = 0; j < mid-2; j++) {
//                        array2FirstPart[start] = array2[j];
//                        start++;
//                    }
//                    start = 0;
//                    for (int k = middle; k < array2.length - 2; k++) {
//                        array2SecondPart[start] = array2[k];
//                        start++;
//                    }
//                }
//                System.out.println("Second array: ");
//                System.out.println(Arrays.toString(array2FirstPart));
//                System.out.println(Arrays.toString(array2SecondPart));
//            }
//            return str;
//        }
    }

    public static void main(String[] args) {

        String first0 = "6913259244";
        String second0 =  "71103343";
        System.out.println("Output MUST be: 6984362587");
        new Solution415().addStrings(first0, second0);

        String first1 = "11";
        String second1 = "123";
        System.out.println("Output MUST be: 134");
        new Solution415().addStrings(first1, second1);

        String first2 = "456";
        String second2 = "77";
        System.out.println("Output MUST be: 533");
        new Solution415().addStrings(first2, second2);

        String first3 = "0";
        String second3 = "0";
        System.out.println("Output MUST be: 0");
        new Solution415().addStrings(first3, second3);
    }
}
