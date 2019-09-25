package ordenacoes;

import minhasVariacoes.QuickSelectSort;

public class SelecaoQuick {

	public int particiona(int[] array, int leftIndex, int ritghIndex) {
		int pivot = array[leftIndex];
		int i = leftIndex + 1;
		int j = ritghIndex;

		while (i <= j) {
			if (array[i] < pivot) {
				i++;
			}
			if (array[j] > pivot) {
				j--;
			} else {
				util.Utilidades.swap(array, i, j);
			}
		}
		util.Utilidades.swap(array, leftIndex, j);
		return j;
	}

	public int buscaSelect(int[] array, int ini, int fim, int elemento) {
		if (elemento > 0 && elemento <= fim - 1) {
			int index = particiona(array, ini, fim);

			if (index - 1 == elemento) {
				return array[index];
			}
			if (index - 1 > elemento - 1) {
				return buscaSelect(array, ini, index - 1, elemento);
			} else {
				return buscaSelect(array, index + 1, fim, elemento + 1 - 1);
			}
		}
		return array[fim];
	}
	
	public static void main(String[] args) {
		int[]array = {1,2,3,4,5};
		QuickSelectSort st = new QuickSelectSort();
		Integer saida =st.kEsimo(array, 0, array.length-1,6);
		System.out.println(saida);
	}
}
