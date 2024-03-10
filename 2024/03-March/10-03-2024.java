
// Name : Chinmoy Das
// Date : 10/03/2024
// Problem : Intersection-of-two-arrays
// Difficulty level : Easy
// Problem Link : https://leetcode.com/problems/intersection-of-two-arrays/

import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int e : nums1) {
            set.add(e);
        }

        Set<Integer> set2 = new HashSet<>();
        for (int e : nums2) {
            set2.add(e);
        }

        set.retainAll(set2);
        int ans[] = new int[set.size()];
        int index = 0;
        for (int e : set) {
            ans[index] = e;
            index++;
        }
        return ans;
    }
}

// Thankyou❤️‍🩹