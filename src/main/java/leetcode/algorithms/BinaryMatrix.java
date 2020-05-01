package leetcode.algorithms;

import java.util.List;

/**
 * A binary matrix means that all elements are 0 or 1. For each individual
 * row of the matrix, this row is sorted in non-decreasing order.
 * <p>
 * Given a row-sorted binary matrix binaryMatrix, return leftmost column
 * index(0-indexed) with at least a 1 in it. If such index doesn't exist, return -1.
 * <p>
 * You can't access the Binary Matrix directly.
 * You may only access the matrix using a BinaryMatrix interface:
 * <p>
 * BinaryMatrix.get(row, col) returns the element of the matrix at index (row, col) (0-indexed).
 * BinaryMatrix.dimensions() returns a list of 2 elements [rows, cols], which means the matrix is rows * cols.
 */
public class BinaryMatrix {

    int get(int r, int c) {
        return 0;
    }

    List<Integer> dimensions() {
        return null;
    }

    public int leftMostColumnWithOne(BinaryMatrix binaryMatrix) {
        List<Integer> d = binaryMatrix.dimensions();
        int rows = d.get(0);
        int cols = d.get(1);
        int c = cols;
        for (int r = 0; r < rows; r++) {
            int lc = binaryMatrix.get(r, c - 1);
            while (lc == 1) {
                c--;
                if (c == 0) return 0;
                lc = binaryMatrix.get(r, c - 1);
            }
        }
        if (c == cols) return -1;
        return c;
    }

}




