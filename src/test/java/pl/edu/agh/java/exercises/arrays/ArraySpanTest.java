package pl.edu.agh.java.exercises.arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ArraySpanTest {
    private ArraySpan subject;
    private int[] array;
    private int expectedMaxSpan;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{}, 0},
                {new int[]{1}, 1},
                {new int[]{1, 2, 1, 1, 3}, 4},
                {new int[]{1, 4, 2, 1, 4, 1, 4}, 6},
                {new int[]{1, 4, 2, 1, 4, 4, 4}, 6},
        });
    }

    public ArraySpanTest(int[] array, int expectedMaxSpan) {
        this.array = array;
        this.expectedMaxSpan = expectedMaxSpan;
        this.subject = new ArraySpan();
    }

    @Test
    public void testMaxSpan() {
        Assert.assertEquals("Invalid result for: " + Arrays.toString(array), expectedMaxSpan, subject.maxSpan(array));
    }
}
