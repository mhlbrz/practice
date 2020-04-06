package leetcode.challange.april;

import java.util.*;

/**
 * Given an array of strings, group anagrams together.
 *
 * Example:
 *
 * Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
 * Output:
 * [
 *   ["ate","eat","tea"],
 *   ["nat","tan"],
 *   ["bat"]
 * ]
 * Note:
 *
 * All inputs will be in lowercase.
 * The order of your output does not matter.
 */
public class GroupAnagrams {

    public static List<List<String>> group(String[] strings) {
        Map<String, List<String>> groups = new HashMap<>();
        for (String s : strings) {
            String sorted = countSort(s);
            List<String> list = groups.putIfAbsent(sorted, new LinkedList<String>(){{add(s);}});
            if (list != null){
                list.add(s);
                groups.put(sorted, list);
            }
        }
        return new ArrayList<>(groups.values());
    }

    public static String countSort(String word) {
        int[] cnt = new int[27];
        for (byte c : word.getBytes()) {
            cnt[c-97]++;
        }
        byte[] bword = new byte[word.length()];
        int j=0;
        for (int i=0; i<27; i++){
            int charCnt = cnt[i];
            while (charCnt > 0){
                bword[j] = (byte)(97 + i);
                j++;
                charCnt--;
            }
        }
        return new String(bword);
    }

}
