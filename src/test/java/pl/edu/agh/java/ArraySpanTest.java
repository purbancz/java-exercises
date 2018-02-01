package pl.edu.agh.java;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ArraySpanTest {
	private ArraySpan arraySpan;
	private int[] array;
	private int expectedMaxSpan;

	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] { 
			{ new int[] {}, 0 }, 
			{ new int[] { 1 }, 1 }, 
			{ new int[] { 1, 2, 1, 1, 3 }, 4 }, 
			{ new int[] { 1, 4, 2, 1, 4, 1, 4 }, 6 }, 
			{ new int[] { 1, 4, 2, 1, 4, 4, 4 }, 6 }, 
		});
	}

	public ArraySpanTest(int[] array, int expectedMaxSpan) {
		this.array = array;
		this.expectedMaxSpan = expectedMaxSpan;
		this.arraySpan = new ArraySpan();
	}

	@Test
	public void testMaxSpans() {
		Assert.assertEquals("Invalid span for: " + Arrays.toString(this.array), this.expectedMaxSpan,
				this.arraySpan.maxSpan(this.array));
	}
}
