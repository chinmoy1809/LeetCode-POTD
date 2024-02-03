
// Name : Chinmoy Das
// Date : 03/02/2024
// Problem : Partition array for maximum sum
// Difficulty level : Medium
// Problem Link : https://leetcode.com/problems/partition-array-for-maximum-sum/

class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int n = arr.length;
        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; ++i) {
            int curmaxi = 0, best = 0;
            for (int t = 1; t <= k && t <= i; ++t) {
                curmaxi = Math.max(curmaxi, arr[i - t]);
                best = Math.max(best, dp[i - t] + curmaxi * t);
            }
            dp[i] = best;
        }
        return dp[n];
    }
}

// Thankyou❤️‍🩹