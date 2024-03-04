
// Name : Chinmoy Das
// Date : 04/03/2024
// Problem : Bag-of-tokens
// Difficulty level : Medium
// Problem Link : https://leetcode.com/problems/bag-of-tokens/

import java.util.*;

class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int s = 0;
        int maxi = 0;
        int l = 0, r = tokens.length - 1;

        while (l <= r) {
            if (power >= tokens[l]) {
                power -= tokens[l];
                s++;
                l++;
                maxi = Math.max(maxi, s);
            } else if (s > 0) {
                power += tokens[r];
                s--;
                r--;
            } else {
                break;
            }
        }

        return maxi;
    }
}

// Thankyou❤️‍🩹