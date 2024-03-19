
// Name : Chinmoy Das
// Date : 19/03/2024
// Problem : Task-scheduler
// Difficulty level : Medium
// Problem Link : https://leetcode.com/problems/task-scheduler/

import java.util.Arrays;

class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        for (char task : tasks) {
            freq[task - 'A']++;
        }
        Arrays.sort(freq);
        int chunk = freq[25] - 1;
        int idle = chunk * n;

        for (int i = 24; i >= 0; i--) {
            idle -= Math.min(chunk, freq[i]);
        }

        return idle < 0 ? tasks.length : tasks.length + idle;
    }
}

// Thankyou❤️‍🩹