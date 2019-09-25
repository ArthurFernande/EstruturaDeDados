package minhasVariacoes;

//fazer quick sort com mediana.
public class QuickSortMediana {

	public int selecionaMediana(int[] array, int ini, int fim) {
		quickSort(array, ini, fim);
		int meio = array.length / 2;
		int mediana = 0;
		// se for par
		if (array.length % 2 == 0) {
			mediana = (array[meio] + array[meio + 1]) / 2;
		}
		// se nao for par
		else {
			mediana = array[meio];
		}
		return mediana;
	}

	public void quickSort(int[] array, int ini, int fim) {
		if (ini <= fim) {
			int pivot = particiona(array, ini, fim);
			quickSort(array, ini, pivot - 1);
			quickSort(array, pivot + 1, fim);
		}
	}

	private int particiona(int[] array, int ini, int fim) {
		int pivot = array[ini];
		int i = ini + 1;
		int j = fim;

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
		util.Utilidades.swap(array, ini, j);
		return j;
	}

	public static void main(String[] args) {
		int[] array = { 1, 4, 6, 7, 8, 9 };
		QuickSortMediana st = new QuickSortMediana();
		int saida = st.selecionaMediana(array, 0, array.length - 1);
		System.out.println(saida);
	}

}
