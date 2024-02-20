
// Name : Chinmoy Das
// Date : 20/02/2024
// Problem : Missing-number
// Difficulty level : Easy
// Problem Link : https://leetcode.com/problems/missing-number/
import java.util.Arrays;

class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return n;
    }
}

// Thankyou❤️‍🩹