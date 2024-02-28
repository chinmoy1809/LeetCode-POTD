
// Name : Chinmoy Das
// Date : 28/02/2024
// Problem : Find-bottom-left-tree-value
// Difficulty level : Easy
// Problem Link : https://leetcode.com/problems/find-bottom-left-tree-value
import java.util.*;

class Solution {
    public int findBottomLeftValue(TreeNode root) {
        int last = 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int count = q.size();
            for (int i = 0; i < count; i++) {
                TreeNode curr = q.poll();
                if (i == 0)
                    last = curr.val; // last leftMost val
                if (curr.left != null)
                    q.add(curr.left);
                if (curr.right != null)
                    q.add(curr.right);
            }
        }
        return last;
    }
}

// Thankyou❤️‍🩹