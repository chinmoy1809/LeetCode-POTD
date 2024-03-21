
// Name : Chinmoy Das
// Date : 21/03/2024
// Problem : Reverse-linked-list
// Difficulty level : Easy
// Problem Link : https://leetcode.com/problems/reverse-linked-list/

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
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode nextNode = null;
        while (curr != null) {
            nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }
}

// Thankyou❤️‍🩹