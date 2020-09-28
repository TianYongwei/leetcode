package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LeetCode0704BinarySearchTest {

  @Test
  void search() {
    assertEquals(4, new LeetCode0704BinarySearch().search(new int[]{-1,0,3,5,9,12}, 9));
  }

  @Test
  void search2() {
    assertEquals(-1, new LeetCode0704BinarySearch().search(new int[]{-1,0,3,5,9,12}, 2));
  }

  @Test
  void search3() {
    assertEquals(0, new LeetCode0704BinarySearch().search(new int[]{-1}, -1));
  }

  @Test
  void search4() {
    assertEquals(-1, new LeetCode0704BinarySearch().search(new int[]{}, -1));
  }
}