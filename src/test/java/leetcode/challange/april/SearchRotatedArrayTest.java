package leetcode.challange.april;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SearchRotatedArrayTest {

    SearchRotatedArray s = new SearchRotatedArray();
    int[][] inputs = new int[][]{
            {4, 5, 6, 7, 0, 1, 2},
            {1, 2, 3, 4, 5, 6},
            {2, 3, 4, 5, 6, 7, 8, 1},
            {8, 1, 2, 3, 4, 5, 6, 7},
            {},
    };
    int[] rInd = new int[]{3, -1, 6, 0, -1};
    int[][] sInd = new int[][]{
            {0, 0, 4}, {0, 3, -1}, {1, 2, 1},
            {1, 0, -1}, {1, 10, -1}, {2, 1, 7},
            {3, 8, 0}, {4, 101, -1}
    };

    @Test
    public void search() {
        for (int[] test : sInd) {
            assertEquals(test[2], s.search(inputs[test[0]], test[1]));
        }
    }

    @Test
    public void rotationInd() {
        for (int i = 0; i < inputs.length; i++) {
            assertEquals(rInd[i], s.rotationInd(inputs[i], 0, inputs[i].length - 1));
        }
    }

}