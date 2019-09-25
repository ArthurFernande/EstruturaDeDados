package ordenacoes;

public class QuickSort {
	
	public void sort(int[] array, int leftIndex, int rightIndex) {
		if(leftIndex<=rightIndex) {
			int pivot = particiona(array, leftIndex,rightIndex);
			
			sort(array, leftIndex, pivot-1);
			sort(array, pivot+1, rightIndex);
			
		}
		
	}

	private int particiona(int[] array, int leftIndex, int rightIndex) {
		int pivot = array[leftIndex];
		int i= leftIndex+1;
		int j= rightIndex;
		
		while(i<=j) {
			if(array[i]< pivot) {
				i++;
			}if(array[j]>pivot) {
				j--;
			}else {
				util.Utilidades.swap(array, i, j);
			}
			
		}
		util.Utilidades.swap(array, leftIndex, j);
		return j;
	}

}
