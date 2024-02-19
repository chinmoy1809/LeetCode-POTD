
// Name : Chinmoy Das
// Date : 19/02/2024
// Problem : Is power of two 
// Difficulty level : easy
// Problem Link : https://leetcode.com/problems/power-of-two/
class Solution {
    public boolean isPowerOfTwo(int n) { 
        return ((n > 0) && (n &(n-1)) == 0);
    }
}

// Thankyou❤️‍🩹