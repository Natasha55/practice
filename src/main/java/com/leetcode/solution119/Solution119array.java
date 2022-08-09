package com.leetcode.solution119;

import java.util.Arrays;
import java.util.List;

/*119. Pascal's Triangle II
https://leetcode.com/problems/pascals-triangle-ii/
        Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.
        In Pascal's triangle, each number is the sum of the two numbers directly above it.
 */

public class Solution119array {
    public Object getRow(int rowIndex) {

        int size = rowIndex + 1;
        Integer[] array = new Integer[size];
        for (int i = 0; i <= rowIndex; i++) {
            array[i] = 1;
        }
        for (int i = 0; i <= rowIndex; i++) {
            for (int j = i - 1; j >= 1; j--) {
                array[j] = array[j - 1] + array[j];
            }
        }
        List<Integer> list = Arrays.asList(array);
        return list;
    }
}
