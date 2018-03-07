package pl.edu.agh.java.exercises.arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ArraySquareUpTest {
    private ArraySquareUp subject;
    private int[] expectedArray;
    private int n;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {0, new int[]{}},
                {1, new int[]{1}},
                {2, new int[]{0, 1, 2, 1}},
                {3, new int[]{0, 0, 1, 0, 2, 1, 3, 2, 1}},
                {4, new int[]{0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1}},
                {5, new int[]{0, 0, 0, 0, 1, 0, 0, 0, 2, 1, 0, 0, 3, 2, 1, 0, 4, 3, 2, 1, 5, 4, 3, 2, 1}},
        });
    }

    public ArraySquareUpTest(int n, int[] expectedArray) {
        this.n = n;
        this.expectedArray = expectedArray;
        this.subject = new ArraySquareUp();
    }

    @Test
    public void testSquareUp() {
        Assert.assertArrayEquals("Invalid result for: " + n, expectedArray, subject.squareUp(n));
    }
}
