package leetcode.challange.april;

import jdk.internal.jline.internal.TestAccessible;

import java.util.HashMap;

/**
 * Given a non-empty array of integers, every element appears
 * twice except for one. Find that single one.
 *
 * Note:
 * Your algorithm should have a linear runtime complexity.
 * Could you implement it without using extra memory?
 */
public class SingleNumber {

    // simple af
    public static int binarySolution(int[] nums) {
        int a = 0;
        for (int n : nums){
            a ^= n;
        }
        return a;
    }


    /**
     * Find single number using extra memory for counting numbers
     * use hashmap to counting numbers, if duplicate found it can
     * be removed from map. At the end we have only 1 entry in map
     *
     * @param nums
     * @return
     */
    public static int hashMapSolution(int[] nums) {
        HashMap<Integer, Integer> cntMap = new HashMap<>();

        for (int n : nums) {
            if (cntMap.containsKey(n)) {
                cntMap.remove(n);
            } else {
                cntMap.put(n, 1);
            }
        }
        return cntMap.entrySet().iterator().next().getKey();
    }

}




