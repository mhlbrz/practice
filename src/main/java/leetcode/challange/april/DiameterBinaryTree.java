package leetcode.challange.april;

import leetcode.algorithms.TreeNode;

import java.util.Arrays;
import java.util.Collections;

/**
 * Given a binary tree, you need to compute the length of the diameter of the tree.
 * The diameter of a binary tree is the length of the longest path between any two nodes in a tree.
 * This path may or may not pass through the root.
 *
 * Example:
 * Given a binary tree
 *           1
 *          / \
 *         2   3
 *        / \
 *       4   5
 * Return 3, which is the length of the path [4,2,1,3] or [5,2,1,3].
 *
 * Note: The length of path between two nodes is represented by the number of edges between them.
 */
public class DiameterBinaryTree {

    public static int getDiameter(TreeNode root) {
        if (root == null) return 0;
        int leftDepth = getDepth(root.left, 0);
        int rightDepth = getDepth(root.right, 0);
        int max = leftDepth + rightDepth;
        int leftMax = getDiameter(root.left);
        int rightMax = getDiameter(root.right);
        return Collections.max(Arrays.asList(max, leftMax, rightMax));
    }

    public static int getDepth(TreeNode root, int depth) {
        if (root == null) return depth;
        return Math.max(getDepth(root.left, depth+1), getDepth(root.right, depth+1));
    }

}
