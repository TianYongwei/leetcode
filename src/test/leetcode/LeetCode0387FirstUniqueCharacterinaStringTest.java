package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode0387FirstUniqueCharacterinaStringTest {

    LeetCode0387FirstUniqueCharacterinaString firstUniqueCharacterinaString
            = new LeetCode0387FirstUniqueCharacterinaString();

    @Test
    void firstUniqChar() {
        assertEquals(0, firstUniqueCharacterinaString.firstUniqChar("leetcode"));
    }

    @Test
    void firstUniqChar2() {
        assertEquals(2, firstUniqueCharacterinaString.firstUniqChar("loveleetcode"));
    }
}