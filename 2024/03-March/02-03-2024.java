
// Name : Chinmoy Das
// Date : 02/03/2024
// Problem : Squares-of-a-sorted-array
// Difficulty level : Easy
// Problem Link : https://leetcode.com/problems/squares-of-a-sorted-array/

import java.util.*;

class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i] = (nums[i] * nums[i]);
        }
        Arrays.sort(nums);
        return nums;
    }
}

// Thankyou❤️‍🩹