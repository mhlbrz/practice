package leetcode.challange.april;

import leetcode.algorithms.TreeNode;

/**
 * Return the root node of a binary search tree that matches the given preorder traversal
 */
public class PreorderBST {

    public TreeNode bstFromPreorder(int[] preorder) {
        if (preorder.length == 0) return null;
        TreeNode root = new TreeNode(preorder[0]);
        for (int i = 1; i < preorder.length; i++) {
            TreeNode node = new TreeNode(preorder[i]);
            addNode(root, node);
        }
        return root;
    }

    private void addNode(TreeNode root, TreeNode node) {
        if (node.val > root.val) {
            if (root.right == null) {
                root.right = node;
            } else {
                addNode(root.right, node);
            }
        } else {
            if (root.left == null) {
                root.left = node;
            } else {
                addNode(root.left, node);
            }
        }
    }

}

