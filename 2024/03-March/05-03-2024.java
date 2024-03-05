
// Name : Chinmoy Das
// Date : 05/03/2024
// Problem : Minimum-length-of-string-after-deleting-similar-ends
// Difficulty level : Medium
// Problem Link : https://leetcode.com/problems/minimum-length-of-string-after-deleting-similar-ends/

class Solution {
    public int minimumLength(String s) {
        int l = 0;
        int r = s.length()-1;
        while (l < r && s.charAt(l) == s.charAt(r)) {
            char ch = s.charAt(l);
            while (l <= r && s.charAt(l) == ch) l++;
            while (l <= r && s.charAt(r) == ch) r--;
        }
        return (l > r) ? 0 : r - l + 1;
    }
}

// Thankyou❤️‍🩹