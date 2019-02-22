package pl.edu.agh.java.exercises.arrays;

import java.util.stream.IntStream;

/**
 * Given an array, return true if there is a place to split the array so that
 * the sum of the numbers on one side is equal to the sum of the numbers on the
 * other side.
 * 
 * Dla zadanej tablicy zwróć true, jeśli da się tak rozmieścić jej elementy, że
 * suma jej elementów w lewej i w prawej połowie będzie równa.
 * 
 * @see http://codingbat.com/prob/p158767
 */
public class ArrayBalance {

	private static boolean balanced;

	public boolean canBalance(int[] array) {
		balanced = false;
		return permuter(array, array.length / 2 );
	}

	private static boolean permuter(int[] array, int index) {

		if (index >= array.length - 1) {
			if (IntStream.range(0, array.length / 2).map(i -> array[i]).sum() == IntStream
					.range(array.length - array.length / 2, array.length).map(i -> array[i]).sum()) {
				balanced = true;
			}
		}

		for (int i = index; i < array.length; i++) {

			int temp = array[index];
			array[index] = array[i];
			array[i] = temp;

			permuter(array, index + 1);

			temp = array[index];
			array[index] = array[i];
			array[i] = temp;

		}

		return balanced;
	}
}
