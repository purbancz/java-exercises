package pl.edu.agh.java.exercises.strings;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class StringSameEndsTest {
    private StringSameEnds subject;
    private String input;
    private String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"", ""},
                {"x", ""},
                {"xx", "x"},
                {"xxx", "x"},
                {"abxyab", "ab"},
                {"abxyba", "a"},
        });
    }

    public StringSameEndsTest(String input, String expectedResult) {
        this.input = input;
        this.expectedResult = expectedResult;
        this.subject = new StringSameEnds();
    }

    @Test
    public void testSameEnds() {
        Assert.assertEquals("Invalid result for: " + input, expectedResult, subject.sameEnds(input));
    }
}
