
// Name : Chinmoy Das
// Date : 14/03/2024
// Problem : Binary-subarrays-with-sum
// Difficulty level : Medium
// Problem Link : https://leetcode.com/problems/binary-subarrays-with-sum/

class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return atMost(nums, goal) - atMost(nums, goal - 1);
    }
    private int atMost(int[] nums, int goal) {
        int head, tail = 0, sum = 0, result = 0;
        for (head = 0; head < nums.length; head++) {
            sum += nums[head];
            while (sum > goal && tail <= head) {
                sum -= nums[tail];
                tail++;
            }
            result += head - tail + 1;
        }
        return result;
    }
}

// Thankyou❤️‍🩹