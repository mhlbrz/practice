package leetcode.challange.april;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberOfIlandsTest {

    @Test
    public void numIslands() {
        NumberOfIlands N = new NumberOfIlands();
        assertEquals(1, N.numIslands(toGrid(new String[]{"11110", "11010", "11000", "00000"})));
        assertEquals(3, N.numIslands(toGrid(new String[]{"11000", "11000", "00100", "00011"})));
        assertEquals(1, N.numIslands(toGrid(new String[]{"111", "010", "111"})));
    }

    private char[][] toGrid(String[] rows) {
        char[][] map = new char[rows.length][];
        for (int i = 0; i < rows.length; i++) {
            map[i] = rows[i].toCharArray();
        }
        return map;
    }

}