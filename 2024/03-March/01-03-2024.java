
// Name : Chinmoy Das
// Date : 01/03/2024
// Problem : Maximum-odd-binary-number
// Difficulty level : Easy
// Problem Link : https://leetcode.com/problems/maximum-odd-binary-number

class Solution {
    public String maximumOddBinaryNumber(String s) {
        int ones = 0;
        int n = s.length();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(n - i - 1) == '1') {
                ones++;
            }
        }
        int ans[] = new int[n];
        ans[n - 1] = 1;
        ones--;
        int i = 0;
        while (ones != 0) {
            ans[i] = 1;
            i++;
            ones--;
        }
        StringBuilder str = new StringBuilder(n);
        for (int num : ans) {
            str.append(num);
        }
        return str.toString();
    }
}

// Thankyou❤️‍🩹