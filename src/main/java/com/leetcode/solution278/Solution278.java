package com.leetcode.solution278;
/*278. First Bad Version
https://leetcode.com/problems/first-bad-version/description/
    You are a product manager and currently leading a team to develop a new product.
    Unfortunately, the latest version of your product fails the quality check. Since each
    version is developed based on the previous version, all the versions after a bad version are also bad.

    Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one,
    which causes all the following ones to be bad.

    You are given an API bool isBadVersion(version) which returns whether version is bad.
    Implement a function to find the first bad version. You should minimize the number of calls to the API
*/


//public class Solution278 extends VersionControl {
//
///* The isBadVersion API is defined in the parent class VersionControl.
//      boolean isBadVersion(int version); */
//
//        public int k;
//        int find = 0;
//
//        public int firstBadVersion(int n) {
//            for (int i=0; i<n; i++) {
//                if (isBadVersion(i) && find==0) {
//                    k = i;
//                    find = 1;
//                }
//            }
//            return k;
//        }
//    }
