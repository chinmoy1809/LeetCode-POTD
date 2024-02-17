// Name : Chinmoy Das
// Date : 17/02/2024
// Problem : Furthest-building-you-can-reach
// Difficulty level : Medium
// Problem Link : https://leetcode.com/problems/furthest-building-you-can-reach/
import java.util.*;

class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int i = 0; i < heights.length - 1; i++) {
            int diff = heights[i + 1] - heights[i];
            if (diff > 0) {
                heap.offer(diff);
                if (heap.size() > ladders) {
                    bricks -= heap.poll();
                }
                if (bricks < 0) {
                    return i;
                }
            }
        }
        return heights.length - 1;
    }
}

// Thankyou❤️‍🩹

