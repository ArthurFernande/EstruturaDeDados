package testOrdenation;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import simpleOrdenation.BubbleSort;
import simpleOrdenation.SelectionSort;

class TestSelectionSort {
	@Test
	public void testOrdenaImpar() {
		SelectionSort ordena = new SelectionSort();
		int[] array1 = { 5, 4, 3, 2, 1 };
		ordena.ordenaSelect(array1);
		int[] array2 = { 1, 2, 3, 4, 5 };
		assertArrayEquals(array2, array1);

	}
	@Test
	public void testOrdenaPar() {
		SelectionSort ordena = new SelectionSort();
		int[] array1 = { 5, 4, 3, 2, 1,0 };
		ordena.ordenaSelect(array1);
		int[] array2 = {0, 1, 2, 3, 4, 5 };
		assertArrayEquals(array2, array1);

	}

	@Test
	public void TestNegativos() {
		SelectionSort ordena = new SelectionSort();
		int[] array3 = { 21, 14, -1, -9, -74, 0 };
		ordena.ordenaSelect(array3);
		int[] array4 = { -74, -9, -1, 0, 14, 21 };
		assertArrayEquals(array4, array3);

	}

	@Test
	public void TestNulo() {
		SelectionSort ordena = new SelectionSort();
		int[] array5 = {};
		ordena.ordenaSelect(array5);
		int[] array6 = {};
		assertArrayEquals(array6, array5);

	}

	

}
