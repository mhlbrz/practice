package leetcode.challange.april;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers and an integer k, you need to find the total number
 * of continuous subarrays whose sum equals to k.
 * <p>
 * Example 1:
 * Input:nums = [1,1,1], k = 2
 * Output: 2
 * Note:
 * The length of the array is in range [1, 20,000].
 * The range of numbers in the array is [-1000, 1000] and the range of the integer k is [-1e7, 1e7].
 */
public class SubarraysSums {

    public int subarraySum(int[] nums, int k) {
        int cnt = 0;
        Map<Integer, Integer> subSums = new HashMap<>();
        int s = 0;
        subSums.put(s, 1);
        for (int n : nums) {
            s += n;
            int adj = subSums.getOrDefault(s - k, 0);
            cnt += adj;
            subSums.computeIfPresent(s, (key, val) -> val + 1);
            subSums.putIfAbsent(s, 1);
        }
        return cnt;
    }

}
