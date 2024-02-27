
// Name : Chinmoy Das
// Date : 27/02/2024
// Problem : Diameter-of-binary-tree
// Difficulty level : Easy
// Problem Link : https://leetcode.com/problems/diameter-of-binary-tree/

class Solution {
    int diameter;

    public int diameterOfBinaryTree(TreeNode root) {
        diameter = 0;
        helper(root);
        return diameter;
    }

    private int helper(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = helper(root.left);
        int right = helper(root.right);
        diameter = Math.max(diameter, left + right);

        return Math.max(left, right) + 1;
    }
}

// Thankyou❤️‍🩹