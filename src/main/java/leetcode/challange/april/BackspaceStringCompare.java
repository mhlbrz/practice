package leetcode.challange.april;

/**
 * Given two strings S and T, return if they are equal when both
 * are typed into empty text editors. # means a backspace character.
 * <p>
 * Example 1:
 * <p>
 * Input: S = "ab#c", T = "ad#c"
 * Output: true
 * Explanation: Both S and T become "ac".
 * Example 2:
 * <p>
 * Input: S = "ab##", T = "c#d#"
 * Output: true
 * Explanation: Both S and T become "".
 * Example 3:
 * <p>
 * Input: S = "a##c", T = "#a#c"
 * Output: true
 * Explanation: Both S and T become "c".
 * Example 4:
 * <p>
 * Input: S = "a#c", T = "b"
 * Output: false
 * Explanation: S becomes "c" while T becomes "b".
 * Note:
 * <p>
 * 1 <= S.length <= 200
 * 1 <= T.length <= 200
 * S and T only contain lowercase letters and '#' characters.
 */
public class BackspaceStringCompare {

    public static boolean isMatch(String S, String T) {
        byte[] s = S.getBytes();
        byte[] t = T.getBytes();
        int slen = nextTrueCharInd(s.length - 1, s);
        int tlen = nextTrueCharInd(t.length - 1, t);
        while (slen >= 0 && tlen >= 0) {
            if (s[slen] != t[tlen]) return false;
            slen = nextTrueCharInd(slen - 1, s);
            tlen = nextTrueCharInd(tlen - 1, t);
        }
        return slen == tlen;
    }

    public static int nextTrueCharInd(int i, byte[] S) {
        int skip = 0;
        while (i >= 0) {
            if (S[i] == '#') {
                skip++;
            } else if (skip > 0) {
                skip--;
            } else {
                return i;
            }
            i--;
        }
        return i;
    }

}
