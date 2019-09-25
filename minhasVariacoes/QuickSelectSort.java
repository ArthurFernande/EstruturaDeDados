package minhasVariacoes;

public class QuickSelectSort {
	
	// Processo de parti��o padr�o do QuickSort ().
	// Considera o �ltimo elemento como piv�
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
	
	// Essa fun��o retorna o menor n�mero de elemento
	// elemento em arr [l..r] usando o QuickSort
	// m�todo baseado. SUPOSI��O: TODOS OS ELEMENTOS
	// EM ARR [] S�O DISTINTOS

	public int kEsimo(int[]array, int leftIndex, int rightIndex, int elemento) {
		// Se elemento for menor que o n�mero de
		// elementos na matriz
		if(elemento >0 && elemento<= rightIndex-1+1) {
			
			// Particione a matriz em torno da �ltima
			// elemento e obt�m a posi��o do piv�
			// elemento na matriz classificada
			int index = particao(array, leftIndex, rightIndex);
			
			// Se a posi��o for igual a k
			if(index-1 == elemento-1) {
				return array[index];
				
			}
			// Se a posi��o for maior, retorne
			// para subarray esquerdo
		 if(index -1 > elemento-1) {
			 return kEsimo(array, leftIndex, index-1, elemento);
		 }
		// Mais se repetem para o subarray direito
		 else {
			 
			 return kEsimo(array, index+1, rightIndex, elemento-index+1-1);
		 }
			
		}
		// Se elementos for maior que o n�mero de
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
