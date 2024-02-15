// Name : Chinmoy Das
// Date : 15/02/2024
// Problem : Find-polygon-with-the-largest-perimeter
// Difficulty level : Medium
// Problem Link : https://leetcode.com/problems/find-polygon-with-the-largest-perimeter/

import java.util.*;

class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        long sum = 0;
        for(int num : nums){
            sum += num;
        }
        for(int i=n-1;i>=2;i--){
            sum -= nums[i];
            if(sum > nums[i]){
                return sum + nums[i];
            }
        }
        return -1;
    }
}

// Thankyou❤️‍🩹