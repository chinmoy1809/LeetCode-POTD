// Name : Chinmoy Das
// Date : 07/02/2024
// Problem : Sort characters by frequency
// Difficulty level : Medium
// Problem Link : https://leetcode.com/problems/sort-characters-by-frequency/

import java.util.*;

class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        PriorityQueue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<>(
                (a, b) -> Integer.compare(b.getValue(), a.getValue()));
        maxHeap.addAll(map.entrySet());

        StringBuilder result = new StringBuilder();
        while (!maxHeap.isEmpty()) {
            Map.Entry<Character, Integer> entry = maxHeap.poll();
            char ch = entry.getKey();
            int freq = entry.getValue();
            for (int i = 0; i < freq; i++) {
                result.append(ch);
            }
        }
        return result.toString();
    }
}

// Thankyou❤️‍🩹