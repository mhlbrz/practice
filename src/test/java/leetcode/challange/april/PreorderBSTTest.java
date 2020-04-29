package leetcode.challange.april;

import leetcode.algorithms.TreeNode;
import org.junit.Test;

public class PreorderBSTTest {

    PreorderBST bst = new PreorderBST();

    @Test
    public void bastFromPreordeer() {
        TreeNode root = bst.bstFromPreorder(new int[]{8, 5, 1, 7, 10, 12});
    }
}