package minhasVariacoes;

import java.util.Arrays;

public class RecursiveInsertionSort {

	public void ordenaIterativo(int[] array, int leftIndex, int righIndex) {
		for (int i = leftIndex; i <= righIndex; i++) {
			int j = i;
			int key = array[i];
			while (j > 0 && key <= array[j - 1]) {
				util.Utilidades.swap(array, j, j - 1);
				j--;

			}
			array[j] = key;

		}

	}

	public void ordenaRecursivo(int[] array, int k) {
		if (k <= 1) {
			return;

		}
		ordenaRecursivo(array, k - 1);

		int key = array[k - 1];
		int j = k - 2;

		while (j >= 0 && array[j] > key) {
			array[j + 1] = array[j];
			j--;

		}
		array[j + 1] = key;

	}

	public static void main(String[] args) {
		int[] array = { 4, 3, 2, 1, 0 };
		RecursiveInsertionSort st = new RecursiveInsertionSort();
		st.ordenaRecursivo(array, array.length - 1 / array[0]);
		System.out.println(Arrays.toString(array));
	}

}
