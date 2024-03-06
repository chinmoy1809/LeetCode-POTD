
// Name : Chinmoy Das
// Date : 06/03/2024
// Problem : Linked-list-cycle
// Difficulty level : Easy
// Problem Link : https://leetcode.com/problems/linked-list-cycle/
class ListNode{
    int val;
    ListNode next;
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode f = head;
        ListNode s = head;
        while(f != null && f.next != null){
            f = f.next.next;
            s = s.next;
            if(f == s){
                return true;
            }
        }
        return false;
    }
}

// Thankyou❤️‍🩹