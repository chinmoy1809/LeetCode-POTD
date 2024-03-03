
// Name : Chinmoy Das
// Date : 03/03/2024
// Problem : Remove-nth-node-from-end-of-list
// Difficulty level : Medium
// Problem Link : https://leetcode.com/problems/remove-nth-node-from-end-of-list/

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 0;
        ListNode temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        if ((length - n - 1) == -1)
            return head.next;
        temp = head;
        for (int i = 0; i < length - n - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}

// Thankyou❤️‍🩹