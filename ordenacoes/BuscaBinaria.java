package ordenacoes;

public class BuscaBinaria {

	public int buscaBinary(int[] array, int elemento) {

		return buscando(array, elemento, 0, array.length - 1);
	}

	private int buscando(int[] array, int elemento, int ini, int fim) {
		int meio = (ini + fim) / 2;

		if (array[meio] == elemento) {
			return array[meio];

		}
		if (array[meio] < elemento) {
			return buscando(array, elemento, meio+1, ini);

		} else {
			return buscando(array, elemento, ini, meio-1);
		}

	}

}
