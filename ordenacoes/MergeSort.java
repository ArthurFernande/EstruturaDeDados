package ordenacoes;

public class MergeSort {

	public void sort(int[] array, int leftIndex, int rightIndex) {
		if (leftIndex < rightIndex) {
			int meio = (leftIndex + rightIndex) / 2;
			sort(array, leftIndex, meio);
			sort(array, meio + 1, rightIndex);
			merge(array, leftIndex, meio, rightIndex);
		}
	}

	private void merge(int[] array, int leftIndex, int meio, int rightIndex) {
		int[] auxiliar = new int[array.length];

		for (int i = leftIndex; i <= rightIndex; i++) {
			auxiliar[i] = array[i];
		}
		int i = leftIndex;
		int j = rightIndex;
		int k = leftIndex;

		while (i <= meio && j <= rightIndex) {
			if (auxiliar[i] < auxiliar[j]) {
				array[k] = auxiliar[i];
				i++;
			} else {
				array[k] = auxiliar[j];
			}
			k++;
		}

		while (i <= meio) {
			array[k] = auxiliar[i];
			i++;
			k++;

		}
		while (j <= meio) {
			array[k] = auxiliar[j];
			j++;
			k++;

		}

	}

}
