package com.leetcode.solution21;

import com.leetcode.Main;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ListNodeTest {
    @DisplayName("if list2 is null")
    @Test
    public void mergeTwoListsWhenSecondNull() {
        ListNode listMerge = new Solution21().mergeTwoLists(new ListNode(1), new ListNode());
        assertEquals(listMerge.next.val, 1);
        assertEquals(listMerge.next.next, null);
    }


    @Test
    public void mergeTwoListsWhenFirstListNull() {
        ListNode listMerge = new Solution21().mergeTwoLists(new ListNode(), new ListNode(2));
        assertEquals(listMerge.next.val, 2);
    }

//    @Description("if both lists are null")
    @Test
    public void mergeTwoListsAreNull() {
        ListNode listMerge = new Solution21().mergeTwoLists(new ListNode(), new ListNode());
        assertEquals(listMerge.next.val, 0);
    }
}
