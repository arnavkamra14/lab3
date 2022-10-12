import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
  @Test
  public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[] { 3 }, input1);
  }

  @Test
  public void testReversed() {
    int[] input1 = {};
    assertArrayEquals(new int[] {}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReverseInPlaceValues() {
    int[] input1 = { 1, 3, 5, 7 };
    ArrayExamples.reverseInPlace(input1);
    int[] expected = { 7, 5, 3, 1 };
    assertArrayEquals(expected, input1);
  }

  @Test
  public void testReversedValues() {
    int[] input1 = { 1, 3, 5, 7 };
    int[] expected = { 7, 5, 3, 1 };
    assertArrayEquals(expected, ArrayExamples.reversed(input1));
  }
}
/*
 * @Test
 * public void testReversedSolo() {
 * 
 * }
 * }
 */
