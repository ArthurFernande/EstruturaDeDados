package minhasVariacoes;

public class QuickSelectSort {
	
	// Processo de partição padrão do QuickSort ().
	// Considera o último elemento como pivô
	// e move todo o elemento menor para a esquerda de
	// ele e elementos maiores para a direita

	public int particao(int[] array, int leftIndex, int rightIndex) {
		int x = array[rightIndex];
		int i = leftIndex;

		for (int j = leftIndex; j <= rightIndex - 1; j++) {
			if (array[j] <= x) {
				util.Utilidades.swap(array, i, j);
				i++;
			}

		}
		util.Utilidades.swap(array, i, rightIndex);
		return i;
	}
	
	// Essa função retorna o menor número de elemento
	// elemento em arr [l..r] usando o QuickSort
	// método baseado. SUPOSIÇÃO: TODOS OS ELEMENTOS
	// EM ARR [] SÃO DISTINTOS

	public int kEsimo(int[]array, int leftIndex, int rightIndex, int elemento) {
		// Se elemento for menor que o número de
		// elementos na matriz
		if(elemento >0 && elemento<= rightIndex-1+1) {
			
			// Particione a matriz em torno da última
			// elemento e obtém a posição do pivô
			// elemento na matriz classificada
			int index = particao(array, leftIndex, rightIndex);
			
			// Se a posição for igual a k
			if(index-1 == elemento-1) {
				return array[index];
				
			}
			// Se a posição for maior, retorne
			// para subarray esquerdo
		 if(index -1 > elemento-1) {
			 return kEsimo(array, leftIndex, index-1, elemento);
		 }
		// Mais se repetem para o subarray direito
		 else {
			 
			 return kEsimo(array, index+1, rightIndex, elemento-index+1-1);
		 }
			
		}
		// Se elementos for maior que o número de
		// elementos na matriz
		return array[rightIndex];
		
	}
	
	public static void main(String[] args) {
		int[]array = {1,2,3,4,5};
		QuickSelectSort st = new QuickSelectSort();
		Integer saida =st.kEsimo(array, 0, array.length-1,6);
		System.out.println(saida);
	}

}
