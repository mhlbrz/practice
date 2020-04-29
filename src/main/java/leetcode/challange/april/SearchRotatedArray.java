package leetcode.challange.april;

/**
 * Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
 * (i.e., [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]).
 * You are given a target value to search. If found in the array return its index, otherwise return -1.
 * You may assume no duplicate exists in the array.
 * Your algorithm's runtime complexity must be in the order of O(log n).
 * <p>
 * Example 1:
 * Input: nums = [4,5,6,7,0,1,2], target = 0
 * Output: 4
 * <p>
 * Example 2:
 * Input: nums = [4,5,6,7,0,1,2], target = 3
 * Output: -1
 */
public class SearchRotatedArray {

    public int search(int[] nums, int target) {
        int rInd = rotationInd(nums, 0, nums.length - 1);
        if (rInd == -1) {
            return binarySearch(nums, target, 0, nums.length);
        } else if (target >= nums[0] && target <= nums[rInd]) {
            return binarySearch(nums, target, 0, rInd + 1);
        } else {
            return binarySearch(nums, target, rInd + 1, nums.length);
        }
    }

    private int binarySearch(int[] A, int x, int b, int e) {
        if (b >= e) return -1;
        int m = (b + e) / 2;
        if (A[m] == x) return m;
        if (x < A[m]) {
            return binarySearch(A, x, b, m);
        } else {
            return binarySearch(A, x, m + 1, e);
        }
    }

    public int rotationInd(int[] A, int b, int e) {
        if (b >= e) return -1;
        if (A[b] < A[e]) return -1;
        int m = (b + e) / 2;
        if (A[m] > A[m + 1]) return m;
        int left = rotationInd(A, b, m);
        if (left == -1) {
            return rotationInd(A, m + 1, e);
        } else {
            return left;
        }
    }

}
