
// Name : Chinmoy Das
// Date : 08/03/2024
// Problem : Count-elements-with-maximum-frequency
// Difficulty level : Easy
// Problem Link : https://leetcode.com/problems/count-elements-with-maximum-frequency/

import java.util.*;

class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int num : nums) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }

        int count = 0;
        int maxFreq = Integer.MIN_VALUE;
        for (int freq : mp.values()) {
            maxFreq = Math.max(maxFreq, freq);
        }

        for (int freq : mp.values()) {
            if (freq == maxFreq)
                count += maxFreq;
        }
        return count;
    }
}

// Thankyou❤️‍🩹