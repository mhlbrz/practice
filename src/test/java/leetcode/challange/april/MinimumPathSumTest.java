package leetcode.challange.april;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinimumPathSumTest {

    @Test
    public void minPathSum() {
        MinimumPathSum ps = new MinimumPathSum();

        int[][] grid = new int[][]{
                {1, 3, 1},
                {1, 5, 1},
                {4, 2, 1}
        };
        assertEquals(7, ps.minPathSum(grid));

        grid = new int[][]{
                {1, 3, 1},
                {1, 1, 5},
                {4, 2, 1}
        };
        assertEquals(6, ps.minPathSum(grid));
    }
}