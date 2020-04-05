package leetcode.algorithms;

import java.util.ArrayList;

public class Tree {


    /**
     * Recursive search in binary search tree
     * @param root
     * @param val
     * @return
     */
    public static TreeNode recurBstSearch(TreeNode root, int val) {
        if (root == null) return null;
        if (root.val == val) return root;
        if (root.val < val) {
            return recurBstSearch(root.left, val);
        } else {
            return recurBstSearch(root.right, val);
        }
    }

    /**
     * Iterative search in binary search tree
     * @param root
     * @param val
     * @return
     */
    public static TreeNode iterBstSearch(TreeNode root, int val) {
        while (root != null) {
            if (root.val == val) return root;
            if (root.val < val) {
                root = root.left;
            } else {
                root = root.right;
            }
        }
        return root;
    }

    /**
     * Convert array to the tree, if array sorted to binary search tree
     * @param arr
     * @return
     */
    public static TreeNode arrayToTree(int[] arr) {
        if (arr.length == 0) return null;
        


        return null;
    }

    /**
     * Covert tree intro 2d array
     * @param root
     * @return 2d array
     */
    public static ArrayList<ArrayList<TreeNode>> treeToArrays(TreeNode root) {
        ArrayList<ArrayList<TreeNode>> arrs = new ArrayList<>();
        recurArraysBuilder(arrs, 1, 0, root);
        return arrs;
    }

    private static void recurArraysBuilder(ArrayList<ArrayList<TreeNode>> arrs, int depth, int ind, TreeNode n) {
        if (n == null) return;
        if (arrs.size() < depth) {
            arrs.add(new ArrayList<>((int) Math.pow(2, depth - 1)));
        }
        arrs.get(depth - 1).add(ind, n);
        recurArraysBuilder(arrs, depth + 1, ind * 2, n.left);
        recurArraysBuilder(arrs, depth + 1, ind * 2 + 1, n.right);
    }

    /**
     * Pretty format for tree
     * @param n root node
     * @return
     */
    public static String treeToString(TreeNode n) {
        ArrayList<ArrayList<TreeNode>> arrs = treeToArrays(n);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arrs.size(); i++) {
            ArrayList<TreeNode> row = arrs.get(i);
            sb.append(row.toString());
            sb.append('\n');
        }
        return sb.toString();
    }

    private static void testTreeToString(){
        int size = 20;
        TreeNode[] nodes = new TreeNode[size];
        for (int i = 0; i < size; i++) {
            nodes[i] = new TreeNode(i);
        }
        for (int i = 0; i < size / 2; i++) {
            int left = i * 2 + 1;
            int right = i * 2 + 2;
            if (left < size) {
                nodes[i].left = nodes[left];
            }
            if (right < size) {
                nodes[i].right = nodes[right];
            }
        }
        System.out.println(treeToString(nodes[0]));
    }
}
