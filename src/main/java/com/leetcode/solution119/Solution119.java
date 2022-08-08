package com.leetcode.solution119;

import java.util.ArrayList;
import java.util.List;

/*119. Pascal's Triangle II
https://leetcode.com/problems/pascals-triangle-ii/
        Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.
        In Pascal's triangle, each number is the sum of the two numbers directly above it.
 */

public class Solution119 {
    public List<Integer> getRow(int rowIndex) {
        int index = 1;

        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        if (rowIndex == 0) {
            return list;
        }

        while (index <= rowIndex) {
            List<Integer> longList = new ArrayList<Integer>();
            longList.add(1);
            for (int i = 1; i < index; i++) {
                longList.add(list.get(i - 1) + list.get(i));
            }
            longList.add(1);
            index++;
            list = longList;
        }
        return list;
    }
}

