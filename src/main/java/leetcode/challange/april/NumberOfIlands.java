package leetcode.challange.april;

import java.util.Arrays;

/**
 * Given a 2d grid map of '1's (land) and '0's (water), count the number of islands.
 * An island is surrounded by water and is formed by connecting adjacent lands horizontally
 * or vertically. You may assume all four edges of the grid are all surrounded by water.
 * <p>
 * Example 1:
 * Input:
 * 11110
 * 11010
 * 11000
 * 00000
 * Output: 1
 * <p>
 * Example 2:
 * Input:
 * 11000
 * 11000
 * 00100
 * 00011
 * Output: 3
 */

public class NumberOfIlands {

    private final static char Explored = '2';

    public int numIslands(char[][] grid) {
        int cnt = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    cnt++;
                    explore(grid, i, j);
                }
            }
        }
        return cnt;
    }

    // explore an island from starting x,y pos
    public void explore(char[][] grid, int x, int y) {
        if (x < 0 || x == grid.length) return;
        if (y < 0 || y == grid[x].length) return;
        if (grid[x][y] != '1') return;
        grid[x][y] = Explored;
        explore(grid, x + 1, y);
        explore(grid, x - 1, y);
        explore(grid, x, y + 1);
        explore(grid, x, y - 1);
    }

    public String gridToString(char[][] grid) {
        StringBuilder sb = new StringBuilder();
        for (char[] row : grid) {
            sb.append(Arrays.toString(row));
            sb.append('\n');
        }
        return sb.toString();
    }

}
