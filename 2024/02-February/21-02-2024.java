
// Name : Chinmoy Das
// Date : 21/02/2024
// Problem : Bitwise-and-of-numbers-range
// Difficulty level : Medium
// Problem Link : https://leetcode.com/problems/bitwise-and-of-numbers-range/

class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int cnt = 0;
        while (left != right) {
            left >>= 1;
            right >>= 1;
            cnt++;
        }
        return (left << cnt);
    }
}

// Thankyou❤️‍🩹