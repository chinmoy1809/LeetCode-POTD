

// Name : Chinmoy Das
// Date : 01/02/2024
// Problem :  Divide Array Into Arrays With Max Difference
// Difficulty level : Medium
// Problem Link : https://leetcode.com/problems/divide-array-into-arrays-with-max-difference/


import java.util.Arrays;

class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int result[][] = new int[nums.length / 3][3];
        if (nums.length % 3 != 0)
            return new int[][] {};
        Arrays.sort(nums);

        int x = 0;
        for (int i = 0; i < nums.length; i += 3) {
            if ((i + 2 < nums.length) && (nums[i + 2] - nums[i]) <= k) {
                result[x][0] = nums[i];
                result[x][1] = nums[i + 1];
                result[x][2] = nums[i + 2];
                x++;
            } else {
                return new int[][] {};
            }
        }
        return result;
    }
}

// Thankyou❤️‍🩹