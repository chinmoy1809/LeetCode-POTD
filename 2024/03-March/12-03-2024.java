
// Name : Chinmoy Das
// Date : 12/03/2024
// Problem : Remove-zero-sum-consecutive-nodes-from-linked-list
// Difficulty level : Medium
// Problem Link : https://leetcode.com/problems/remove-zero-sum-consecutive-nodes-from-linked-list/

import java.util.HashMap;

class ListNode{
    int val;
    ListNode next;
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
    public ListNode(int i) {
    }
}

class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {
        int prefixSum = 0;
        HashMap<Integer, ListNode> map = new HashMap<>();
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        map.put(0, dummy);
        while (head != null) {
            prefixSum += head.val;
            if (map.containsKey(prefixSum)) {
                ListNode start = map.get(prefixSum);
                ListNode temp = start;
                int sum = prefixSum;
                while (temp != head) {
                    temp = temp.next;
                    sum += temp.val;
                    if (temp != head)
                        map.remove(sum);
                }
                start.next = head.next;
            } else {
                map.put(prefixSum, head);
            }
            head = head.next;
        }
        return dummy.next;
    }
}

// Thankyou❤️‍🩹