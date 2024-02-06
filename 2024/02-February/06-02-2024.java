// Name : Chinmoy Das
// Date : 06/02/2024
// Problem : Group Anagrams
// Difficulty level : Medium
// Problem Link : https://leetcode.com/problems/group-anagrams/submissions/

import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String w : strs) {
            char[] ch = w.toCharArray();
            Arrays.sort(ch);
            String sorted = new String(ch);

            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(w);
        }
        return new ArrayList<>(map.values());
    }
}

// Thankyou❤️‍🩹