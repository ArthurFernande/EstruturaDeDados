package minhasVariacoes;

import java.util.Arrays;

/*
 ideia do selection colocar o menor no seu devido lugar a cada passada ,
  comparo o primeiro e vejo todo resto, comparando com o primeiro
   o menor ira para o indice respectivo ao primeiro, incremento
    e o menor será o segundo, e repito o proceeso ate o fim do vetor.
    No selection simultaneo faço o mesmo so que usando o maior e menor,
    ou seja pecorro todo o vetor e coloco o menor e maior em seus lugares
    em uma unica passada.
 */

public class SimultaneoSelection {
	public void ordena(int[] array, int inicio, int fim) {

		for (int i = inicio; i <= fim; i++) {
			int menor = i;
			for (int j = i + 1; j <= array.length - 1; j++) {
				if (array[j] < array[menor]) {
					menor = j;

				}

			}
			util.Utilidades.swap(array, i, menor);

			int iterador = fim;
			int maior = iterador;
			for (int k = iterador; k >= fim; k--) {
				if (array[k] > array[maior]) {
					maior = k;
				}

			}
			util.Utilidades.swap(array, maior, iterador);

		}
	}

	public static void main(String[] args) {
		int[] array = { 4, 3, 2, 1, 0 };
		SimultaneoSelection st = new SimultaneoSelection();
		st.ordena(array, 0, array.length - 1);
		System.out.println(Arrays.toString(array));
	}

}
