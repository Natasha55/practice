package com.leetcode;
import com.leetcode.listNode.ListNode;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static class Solution {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            ListNode fin = new ListNode(0);
            ListNode prev = fin;

            while ((list1 != null) && (list2 != null)) {
                if (list1.val <= list2.val) {
                    prev.next = list1;
                    list1 = list1.next;
                } else {
                    prev.next = list2;
                    list2 = list2.next;
                }
                prev = prev.next;
            }
            if (list1 == null) {
                prev.next = list2;
            }
            if (list2 == null) {
                prev.next = list1;
            }
            if ((list1 == null) && (list2 == null)) {
                prev.next = new ListNode();
            }
            return fin.next;
        }
    }
    //    public static class Solution2 {
//        public int climbStairs(int n) {
//            int oneStep = n - 1;
//            int twoSteps = n - 2;
//            if (n < 4) {
//                return n;
//            }
//            int result = oneStep + twoSteps;
//            return result;
//        }
//    }
}
