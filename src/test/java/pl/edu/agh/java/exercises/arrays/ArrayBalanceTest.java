package pl.edu.agh.java.exercises.arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ArrayBalanceTest {
    private ArrayBalance subject;
    private int[] array;
    private boolean expectedCanBalance;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
        	
// poprawione
//                {new int[]{}, true},
//                {new int[]{1}, false},
//                {new int[]{1, 1}, true},
//                {new int[]{1, 2}, false},
//                {new int[]{1, 1, 2}, true},
//                {new int[]{1, 2, 2}, false},
//                {new int[]{1, 2, 3}, true},
//                {new int[]{33, 33, 1, 2, 1}, true},
//                {new int[]{2, 1, 1, 2, 1}, false},
//                {new int[]{3, 4, 5, 6}, true},
//                
// ze strony
//              {new int[]{1, 1, 1, 2, 1}, true},	
//        		{new int[]{2, 1, 1, 2, 1}, false},	
//				{new int[]{10, 10}, true},
//				{new int[]{10, 0, 1, -1, 10}, true},	
//				{new int[]{1, 1, 1, 1, 4}, true},	
//				{new int[]{2, 1, 1, 1, 4}, false},	
//				{new int[]{2, 3, 4, 1, 2}, true},	
//				{new int[]{1, 2, 3, 1, 0, 2, 3}, true},	
//				{new int[]{1, 2, 3, 1, 0, 1, 3}, false},	
//				{new int[]{1}, false},	
//				{new int[]{1, 1, 1, 2, 1}, true},
        	
// oryginalne
				
				{new int[]{}, true},
                {new int[]{1}, true},
                {new int[]{1, 1}, true},
                {new int[]{1, 2}, false},
                {new int[]{1, 1, 2}, true},
                {new int[]{1, 2, 2}, true},
                {new int[]{1, 2, 3}, false},
                {new int[]{33, 33, 1, 2, 1}, true},
                {new int[]{2, 1, 1, 2, 1}, true},
                {new int[]{3, 4, 5, 6}, true},
        });
    }

    public ArrayBalanceTest(int[] array, boolean expectedCanBalance) {
        this.array = array;
        this.expectedCanBalance = expectedCanBalance;
        this.subject = new ArrayBalance();
    }

    @Test
    public void testCanBalance() {
        Assert.assertEquals("Invalid result for: " + Arrays.toString(array), expectedCanBalance, subject.canBalance(array));
    }
}
