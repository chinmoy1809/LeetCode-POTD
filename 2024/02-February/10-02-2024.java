
// Name : Chinmoy Das
// Date : 10/02/2024
// Problem : Palindromic-substrings
// Difficulty level : Medium
// Problem Link : https://leetcode.com/problems/palindromic-substrings/

class Solution {
    public boolean isPalindrome(String s, int left, int right) {
        while(left < right) {
            if(s.charAt(left++) != s.charAt(right--)) return false;
        } 
        return true;
    }
    public int countSubstrings(String s) {
        int ans = 0;
        int n = s.length();
        for(int i=0;i<n;i++) {
            for(int j=i;j<n;j++) {
                if(isPalindrome(s, i, j)) ans++;
            }
        }
        return ans;
    }
}

// Thankyou❤️‍🩹