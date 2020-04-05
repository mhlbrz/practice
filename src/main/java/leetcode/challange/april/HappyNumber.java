package leetcode.challange.april;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Write an algorithm to determine if a number is "happy".
 * <p>
 * A happy number is a number defined by the following process: Starting with any positive integer,
 * replace the number by the sum of the squares of its digits, and repeat the process until the number
 * equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
 * Those numbers for which this process ends in 1 are happy numbers.
 */
public class HappyNumber {

    public boolean cache(int n) {
        HashSet<Integer> history = new HashSet<>();
        while (!history.contains(n)) {
            ArrayList<Integer> digits = new ArrayList<>();
            int a = n;
            while (a > 0) {
                digits.add(a % 10);
                a /= 10;
            }
            if (digits.stream().mapToInt(x -> x).sum() == 1) {
                return true;
            } else {
                history.add(n);
                n = digits.stream()
                        .mapToInt(x -> x)
                        .map((x) -> x * x)
                        .sum();
            }
        }
        return false;
    }



}
