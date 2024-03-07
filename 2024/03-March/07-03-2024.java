
// Name : Chinmoy Das
// Date : 07/03/2024
// Problem : Middle-of-the-linked-list
// Difficulty level : Easy
// Problem Link : https://leetcode.com/problems/middle-of-the-linked-list/
class ListNode{
    int val;
    ListNode next;
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
class Solution {
    public ListNode middleNode(ListNode head) {
        int length = 0;
        ListNode temp = head;
        while(temp != null){
            length++;
            temp = temp.next;
        }
        temp = head;
        int mid = length/2 + 1;
            for(int i=1;i< mid ;i++){
                temp = temp.next;
            }
        head = temp;
        return head;
    }
}

// Thankyou❤️‍🩹