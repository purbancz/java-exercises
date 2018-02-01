package pl.edu.agh.java;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ArrayBalanceTest {
    private ArrayBalance arrayBalance;
    private int[] array;
    private boolean expectedCanBalance;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{}, true},
                {new int[]{1}, true},
                {new int[]{1, 1}, true},
                {new int[]{1, 2}, false},
                {new int[]{1, 1, 2}, true},
                {new int[]{1, 2, 2}, true},
                {new int[]{1, 2, 3}, false},
                {new int[]{33, 33, 1, 2, 1}, true},
                {new int[]{2, 1, 1, 2, 1}, false},
                {new int[]{3, 4, 5, 6}, true},
        });
    }

    public ArrayBalanceTest(int[] array, boolean expectedCanBalance) {
        this.array = array;
        this.expectedCanBalance = expectedCanBalance;
        this.arrayBalance = new ArrayBalance();
    }

    @Test
    public void testCanBalance() {
        Assert.assertEquals("Invalid span for: " + Arrays.toString(this.array), this.expectedCanBalance,
                this.arrayBalance.canBalance(this.array));
    }
}
