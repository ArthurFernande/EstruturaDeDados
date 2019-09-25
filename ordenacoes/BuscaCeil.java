package ordenacoes;

public class BuscaCeil {

	public int buscaCeil(int[] array, int elemento) {
		if (array[array.length - 1] < elemento) {
			return array[array.length - 1];
		}
		if (array[0] > elemento) {
			return (Integer) null;
		}
		int candidato = array[array.length / 2];
		return buscando(array, elemento, 0, array.length - 1, candidato);
	}

	private int buscando(int[] array, int elemento, int ini, int fim, int candidato) {
		Integer floor = candidato;
		if (ini > fim) {
			if (!floor.equals(null) && floor < elemento) {
				return floor;

			}
		}

		int meio = (ini + fim) / 2;
		if (array[meio] == elemento) {
			return array[meio];
		} else if (array[meio] < elemento) {
			floor = array[meio];
			return buscando(array, elemento, meio + 1, fim, floor);
		} else {
			return buscando(array, elemento, ini, meio - 1, floor);
		}
	}

	public static void main(String[] args) {
		int[] array = { 1, 4, 6, 7, 8 };
		BuscaCeil st = new BuscaCeil();
		int saida = st.buscaCeil(array, 9);
		System.out.println(saida);
	}

}
