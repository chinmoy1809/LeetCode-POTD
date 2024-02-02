
// Name : Chinmoy Das
// Date : 02/02/2024
// Problem :  Sequential Digits
// Difficulty level : Medium
// Problem Link : https://leetcode.com/problems/sequential-digits/

import java.util.*;

class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans = new ArrayList<>();
        String s = "123456789";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                int temp = Integer.parseInt(s.substring(i, j + 1));

                if (low <= temp && temp <= high)
                    ans.add(temp);
                if (temp > high)
                    break;
            }
        }
        ans.sort(null);
        return ans;
    }
}

// Thankyou❤️‍🩹