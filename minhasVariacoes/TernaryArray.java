package minhasVariacoes;

import java.util.Arrays;

public class TernaryArray {

	public void ternaryArray(int[] array) {
		int maior = acharMaior(array);
		int menor = acharMenor(array);

		int menorPosicao = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] == menor) {
				util.Utilidades.swap(array, menorPosicao, i);
				menorPosicao++;
			}
		}
		int maiorPosicao = array.length - 1;
		for (int i = array.length - 1; i >= 0; i--) {
			if (array[i] == maior) {
				util.Utilidades.swap(array, maiorPosicao, i);
				maiorPosicao--;
			}

		}
	}

	private int acharMenor(int[] array) {
		int menor = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < menor) {
				menor = array[i];
			}

		}
		return menor;
	}

	private int acharMaior(int[] array) {
		int maior = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > maior) {
				maior = array[i];
			}

		}
		return maior;
	}
	

	
}
