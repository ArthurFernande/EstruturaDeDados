package util;

public class Swap {

	public static void swap(int[] array, int elemento1, int elemento2) {
		int temp = array[elemento1];
		array[elemento1] = array[elemento2];
		array[elemento2] = temp;

	}

}
