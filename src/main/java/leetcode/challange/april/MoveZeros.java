package leetcode.challange.april;

/**
 * Given an array nums, write a function to move all 0's to the end of it while
 * maintaining the relative order of the non-zero elements.
 * <p>
 * Example:
 * <p>
 * Input: [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 * Note:
 * <p>
 * You must do this in-place without making a copy of the array.
 * Minimize the total number of operations.
 */
public class MoveZeros {

    public static void move(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                continue;
            } else {
                if (j != i) {
                    arr[j] = arr[i];
                    arr[i] = 0;
                    while (arr[j] != 0) {
                        j++;
                    }
                } else {
                    j++;
                }
            }
        }
    }

}
