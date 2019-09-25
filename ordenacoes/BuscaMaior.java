package ordenacoes;

public class BuscaMaior {

	public int buscaMaior(int[] array, int elemento) {
		int candidato = array[array.length / 2];
		return buscando(array, 0, array.length - 1, elemento, candidato);
	}

	private int buscando(int[] array, int ini, int fim, int elemento, int candidato) {
		Integer maior = candidato;
		if (ini > fim) {
			if(!maior.equals(null)&& maior >elemento) {
				return maior;
			}
		}
		int meio =(ini+fim)/2;
		
		if(array[meio]== elemento) {
			return array[meio];
		}else if(array[meio]>elemento) {
			maior = array[meio];
			return buscando(array, ini, meio-1, elemento, maior);
		}else {
			return buscando(array, meio+1, fim, elemento, maior);
		}
	}
	
	public static void main(String[] args) {
		int[] array = { 1, 4, 6, 7, 8 };
		BuscaMaior st = new BuscaMaior();
		int saida = st.buscaMaior(array, 5);
		System.out.println(saida);
	}

}
