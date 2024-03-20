
// Name : Chinmoy Das
// Date : 20/03/2024
// Problem : Merge-in-between-linked-lists
// Difficulty level : Medium
// Problem Link : https://leetcode.com/problems/merge-in-between-linked-lists/

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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode currNode = list1;
        int index = 0;
        while (index < a - 1) {
            currNode = currNode.next;
            index++;
        }
        ListNode front = currNode;
        while (index < b + 1) {
            currNode = currNode.next;
            index++;
        }
        ListNode rear = currNode;
        ListNode secondListTail = list2, secondListHead = list2;
        while (secondListTail.next != null) {
            secondListTail = secondListTail.next;
        }
        front.next = secondListHead;
        secondListTail.next = rear;
        return list1;
    }
}

// Thankyou❤️‍🩹