// Name : Chinmoy Das
// Date : 14/02/2024
// Problem : Rearrange-array-elements-by-sign
// Difficulty level : Medium
// Problem Link : https://leetcode.com/problems/rearrange-array-elements-by-sign/

class Solution {
    public int[] rearrangeArray(int[] a) {
        int n = a.length;
        int[] ans = new int[n];
        int posIndex = 0, negIndex = 1;
        for (int i = 0; i < n; i++) {
            if (a[i] > 0) {
                ans[posIndex] = a[i];
                posIndex += 2;
            } else {
                ans[negIndex] = a[i];
                negIndex += 2;
            }
        }
        return ans;

    }
}

// Thankyou❤️‍🩹