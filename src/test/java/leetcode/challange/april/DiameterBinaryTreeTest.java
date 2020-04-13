package leetcode.challange.april;

import leetcode.algorithms.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class DiameterBinaryTreeTest {

    @Test
    public void diameter() {

        TreeNode[] nodes = new TreeNode[5];
        for (int i = 0; i < 5; i++) {
            nodes[i] = new TreeNode(i);
        }

        nodes[0].left = nodes[1];
        nodes[0].right = nodes[2];
        nodes[1].left = nodes[3];
        nodes[1].right = nodes[4];
        assertEquals(3, DiameterBinaryTree.getDiameter(nodes[0]));

        nodes[2].right = new TreeNode(5);
        assertEquals(4, DiameterBinaryTree.getDiameter(nodes[0]));
    }

}