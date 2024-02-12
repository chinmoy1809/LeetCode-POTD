// Name : Chinmoy Das
// Date : 12/02/2024
// Problem : Majority-element
// Difficulty level : Easy
// Problem Link : https://leetcode.com/problems/majority-element/

class Solution {
    public int majorityElement(int[] nums) {
        int x = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                x = nums[i];
                count++;
            } else if (nums[i] == x) {
                count++;
            } else {
                count--;
            }
        }
        return x;
    }
}

// Thankyou❤️‍🩹