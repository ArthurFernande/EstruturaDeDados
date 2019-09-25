package minhasVariacoes;

import java.util.Arrays;

/*ideia : fazer o que o bubble faz só que fazendo
com os maiores e menores simultaniamente,
ou seja, a cada passada no laço ordenar maiores e menores no seu respectivo lugar.*/

public class SimultaneoBubbleSort {
	
	
	
	public void ordena(int [] array,int leftIndex,int rightIndex) {
			int  comeco = leftIndex;
			int ultimo =rightIndex;
			
			if(comeco < rightIndex) {
				if(array[comeco] > array[comeco+1]) {
					util.Utilidades.swap(array, comeco, comeco+1);
					
				}
				comeco++;
				ordena(array, comeco, rightIndex);
			}
			if(ultimo > leftIndex) {
				if(array[ultimo]< array[ultimo-1]) {
					util.Utilidades.swap(array, ultimo, ultimo-1);
					
				}
				ultimo--;
				ordena(array, leftIndex, ultimo);
				
			}
		
	}
	
	
	
public static void main(String[] args) {
	int []array = {4,3,2,1,0};
	SimultaneoBubbleSort st = new SimultaneoBubbleSort();
	st.ordena(array, 0, array.length-1);
	System.out.println(Arrays.toString(array));
}
	
	
	
	

}
