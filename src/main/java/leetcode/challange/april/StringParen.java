package leetcode.challange.april;

/**
 * Given a string containing only three types of characters: '(', ')' and '*',
 * write a function to check whether this string is valid. We define the validity of a string by these rules:
 * <p>
 * Any left parenthesis '(' must have a corresponding right parenthesis ')'.
 * Any right parenthesis ')' must have a corresponding left parenthesis '('.
 * Left parenthesis '(' must go before the corresponding right parenthesis ')'.
 * '*' could be treated as a single right parenthesis ')' or a single left parenthesis '(' or an empty string.
 * An empty string is also valid.
 * Example 1:
 * Input: "()"
 * Output: True
 * Example 2:
 * Input: "(*)"
 * Output: True
 * Example 3:
 * Input: "(*))"
 * Output: True
 * Note:
 * The string size will be in the range [1, 100].
 */

public class StringParen {
    public boolean checkValidString(String s) {
        char[] sa = s.toCharArray();
        if (valid(sa)) {
            return true;
        } else {
            for (int i = 0; i < sa.length; i++) {
                if (sa[i] == '*') {
                    int diff = lbalance(sa, 0, i) - rbalance(sa, i + 1, sa.length - 1);
                    if (diff > 0) {
                        sa[i] = ')';
                    } else if (diff < 0) {
                        sa[i] = '(';
                    }
                }
            }
            return valid(sa);
        }
    }

    public boolean valid(char[] sa) {
        int bal = 0;
        for (char c : sa) {
            if (bal < 0) return false;
            if (c == '(') bal++;
            if (c == ')') bal--;
        }
        return bal == 0;
    }

    public int lbalance(char[] s, int b, int e) {
        int d = 0;
        for (int i = b; i < e; i++) {
            if (d < 0) d = 0;
            if (s[i] == '(') d++;
            if (s[i] == ')') d--;
        }
        return d;
    }

    public int rbalance(char[] s, int b, int e) {
        int d = 0;
        for (int i = e; i >= b; i--) {
            if (d < 0) d = 0;
            if (s[i] == ')') d++;
            if (s[i] == '(') d--;
        }
        return d;
    }


}
