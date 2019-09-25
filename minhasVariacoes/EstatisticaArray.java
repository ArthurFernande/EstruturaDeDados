package minhasVariacoes;

import java.util.Arrays;

public class EstatisticaArray {

	public int[] estatistica(int[] array, int k) {
		int[] auxiliar = new int[k];
		
		for (int i = 0; i <= array.length - 1; i++) {
			int menor = i;
			for (int j = i + 1; j <= array.length - 1; j++) {
				if (array[j] < array[menor]) {
					menor = j;
				}

			}
			util.Utilidades.swap(array, i, menor);

		}
		for (int t = 0; t <= k-1; t++) {
			auxiliar[t] = array[t];

		}
		return auxiliar;

	}

	public static void main(String[] args) {
		int[] array = { 1, 4, 7, 9, 10, 3, 5 };
		EstatisticaArray st = new EstatisticaArray();
		int[] saida= st.estatistica(array, 4);
		System.out.println(Arrays.toString(saida));
	}

}
