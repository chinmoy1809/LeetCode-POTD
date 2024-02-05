// Name : Chinmoy Das
// Date : 05/02/2024
// Problem : First unique character in a string
// Difficulty level : Easy
// Problem Link : https://leetcode.com/problems/first-unique-character-in-a-string/

import java.util.HashMap;

class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), (map.get(s.charAt(i)) + 1));
            } else {
                map.put(s.charAt(i), 1);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}

// Thankyou❤️‍🩹