package simpleOrdenation;

public class SelectionSort {

	public void ordenaSelect(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int menor = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[menor]) {
					menor = j;
				}

			}
			util.Swap.swap(array, menor, i);

		}

	}

}
