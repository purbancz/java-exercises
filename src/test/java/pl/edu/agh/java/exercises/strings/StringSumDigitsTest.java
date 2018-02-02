package pl.edu.agh.java.exercises.strings;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class StringSumDigitsTest {
    private StringSumDigits subject;
    private String input;
    private int expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"", 0},
                {"abc", 0},
                {"ab1c", 1},
                {"aa1bc2d3", 6},
                {"aa11b33", 8},
                {"777", 21},
        });
    }

    public StringSumDigitsTest(String input, int expectedResult) {
        this.input = input;
        this.expectedResult = expectedResult;
        this.subject = new StringSumDigits();
    }

    @Test
    public void testSumDigits() {
        Assert.assertEquals("Invalid result for: " + input, expectedResult, subject.sumDigits(input));
    }
}
