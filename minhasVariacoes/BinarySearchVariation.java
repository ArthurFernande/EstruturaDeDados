package minhasVariacoes;

import java.util.Arrays;

public class BinarySearchVariation {
	/*
	 * sei que a busca binaria serve para achar um elemnento que está sendo
	 * procurado.
	 * 
	 */

	// ordenei usando o quickSort
	public void ordena(int[] array, int inicio, int fim) {
		if (inicio < fim) {
			int pivot = particiona(array, inicio, fim);
			ordena(array, inicio, pivot - 1);
			ordena(array, pivot + 1, fim);

		}

	}

	private int particiona(int[] array, int inicio, int fim) {
		int i = inicio + 1;
		int j = fim;
		int pivot = array[inicio];

		while (i <= j) {
			if (array[i] < pivot) {
				i++;

			} else if (array[j] > pivot) {
				j--;

			} else {
				util.Utilidades.swap(array, j, i);
			}

		}
		util.Utilidades.swap(array, inicio, j);
		return j;

	}

	// busca binaria normal
	public int buscaBinaria(int[] array, int elemento) {

		ordena(array, 0, array.length - 1);
		return buscando(array, elemento, 0, array.length - 1);
	}

	private int buscando(int[] array, int elemento, int inicio, int fim) {
		int meio = (inicio + fim) / 2;
		if (inicio > fim) {
			return -1;

		}
		if (array[meio] == elemento) {
			return array[meio];

		}
		if (array[meio] < elemento) {
			return buscando(array, elemento, meio + 1, fim);

		} else {
			return buscando(array, elemento, inicio, meio - 1);
		}
	}
	/*
	 * o floor retorna o elemento no array que e menor e o mais proximo possivel.
	 */

	public Integer floor(int[] array, int elemento) {
		ordena(array, 0, array.length - 1);
		if (array[0] > elemento) {
			return null;

		}
		if (array[array.length - 1] < elemento) {
			return array[array.length - 1];
		}
		int candidato = array[array.length / 2];
		return buscaFloor(array, elemento, candidato, 0, array.length - 1);

	}

	private Integer buscaFloor(int[] array, int elemento, int candidato, int inicio, int fim) {
		Integer floor = candidato;
		if (inicio > fim) {
			if (!floor.equals(null) && floor < elemento) {
				return floor;

			}

		}

		int meio = (inicio + fim) / 2;

		if (array[meio] == elemento) {
			return array[elemento];

		}
		if (array[meio] > elemento) {
			floor = array[meio];
			return buscaFloor(array, elemento, floor, inicio, meio - 1);

		} else {
			return buscaFloor(array, elemento, floor, meio + 1, fim);
		}

	}

	// olha o main .

	public static void main(String[] args) {

		int[] array = { 4, 3, 2, 0, 1 };
		BinarySearchVariation st = new BinarySearchVariation();
		int saida = st.floor(array, 1);
		System.out.println(saida);

	}

}
