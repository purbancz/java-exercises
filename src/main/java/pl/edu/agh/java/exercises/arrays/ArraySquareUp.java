package pl.edu.agh.java.exercises.arrays;

import java.util.Arrays;

/**
 * Given n>=0, create an array length n*n with the following pattern, shown here
 * and in the unit tests: for n=3 : {0, 0, 1, 0, 2, 1, 3, 2, 1}
 * 
 * Dla zadanego n>=0 zwróć tablicę o długości n*n utworzoną wg wzoru podanego
 * tutaj oraz w testach jednostkowych: dla n=3: {0, 0, 1, 0, 2, 1, 3, 2, 1}
 * 
 *
 * @see http://codingbat.com/prob/p155405
 */
public class ArraySquareUp {
	public int[] squareUp(int n) {
		int[] arr = new int[n * n];
		for (int i = 0; i < n*n; i++) {
			int rev = n - (i) %  n;
			if (rev <= i/n+1) {
				arr[i] = rev;
			}
			//n - (i) %  n
			// i/n+1
		}
		return arr;
	}

//	public static void main(String[] args) {
//		ArraySquareUp array = new ArraySquareUp();
//		System.out.println(Arrays.toString(array.squareUp(5)));
//	}
}
