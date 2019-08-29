package simpleOrdenation;

import java.lang.reflect.Array;

public class BubbleSort {

	// obs: fazer compareTo

	public void ordenaArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j + 1]) {
					util.Swap.swap(array, j, j + 1);

				}

			}

		}

	}

}
