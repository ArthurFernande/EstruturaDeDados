package minhasVariacoes;

import java.util.Arrays;

public class EstatisticaOrdem {
	
	// dado um array 1,2,4,6,8 retorna o kesimo menor elemento desse array
	public int statistics(int[]array, int k) {
		int menor = econtraMenor(array);
		int order =1;
		return orderStatistc(array,menor,order,k);
		
	}

	private int orderStatistc(int[] array, int menor, int order, int k) {
		if(k==order) {
			return menor;
		}else {
			int novoMenor= array[0];
			
			for (int i = 0; i < array.length; i++) {
				if(array[i]>menor) {
					novoMenor = array[i];
					break;
					
				}
			}
			for (int i = 0; i < array.length; i++) {
				if(array[i] >menor && array[i]< novoMenor) {
					novoMenor =array[i];
					
				}
			}
			return orderStatistc(array, novoMenor, order+1, k);
		}
	}

	private int econtraMenor(int[] array) {
		int menor =array[0];
		for (int i = 0; i < array.length; i++) {
			if(array[i]< menor) {
				menor =array[i];
			}
		}
		return menor;
		
		
	}
	
	public static void main(String[] args) {
		int [] array = {1,4,6,8,9,12};
		EstatisticaOrdem st = new EstatisticaOrdem();
		int saida =st.statistics(array, 6);
		System.out.println(saida);
	}

}
