// Name : Chinmoy Das
// Date : 13/02/2024
// Problem : Find-first-palindromic-string-in-the-array
// Difficulty level : Easy
// Problem Link : https://leetcode.com/problems/find-first-palindromic-string-in-the-array/

class Solution {
    private static boolean isPalindromic(String str) {
        int low = 0, high = str.length() - 1;
        while (low < high) {
            if (str.charAt(low) == str.charAt(high)) {
                low++;
                high--;
            } else {
                return false;
            }
        }
        return true;
    }

    public String firstPalindrome(String[] words) {
        for (int i = 0; i < words.length; i++) {
            if (isPalindromic(words[i])) {
                return words[i];
            }
        }
        return "";
    }
}

// Thankyou❤️‍🩹