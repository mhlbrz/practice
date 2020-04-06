package leetcode.challange.april;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class GroupAnagramsTest {

    @Test
    public void group() {
       String[] in = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
       List<List<String>> groups = GroupAnagrams.group(in);
       assertEquals(3, groups.size());
    }

    @Test
    public void countSort() {
        String[] strings = new String[]{"vendum", "angrod", "dispot", "hazala"};
        String[] want = new String[]{"demnuv", "adgnor", "diopst", "aaahlz"};
        assertArrayEquals(want, Arrays.stream(strings).map((s) -> GroupAnagrams.countSort(s)).toArray());
    }

}