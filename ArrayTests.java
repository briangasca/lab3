import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);

    int[] input2 = {3,2,1};
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{1,2,3}, input2);

    int[] input3 = {};
    ArrayExamples.reverseInPlace(input3);
    assertArrayEquals(new int[]{}, input3);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testAverageWithoutLowest() {
    double[] input = {1,2,3,4,5,6};
    double expected = (2+3+4+5+6) / input.length - 1;

    double returned = ArrayExamples.averageWithoutLowest(input);

    assertEquals(Double.valueOf(expected), Double.valueOf(returned));
  }
}
