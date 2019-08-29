package testOrdenation;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import simpleOrdenation.BubbleSort;

class TestBubbleSort {

	@Test
	public void testOrdena() {
		BubbleSort ordena = new BubbleSort();
		int[] array1 = { 5, 4, 3, 2, 1 };
		ordena.ordenaArray(array1);
		int[] array2 = { 1, 2, 3, 4, 5 };
		assertArrayEquals(array2, array1);

	}

	@Test
	public void TestNegativos() {
		BubbleSort ordena = new BubbleSort();
		int[] array3 = { 21, 14, -1, -9, -74, 0 };
		ordena.ordenaArray(array3);
		int[] array4 = { -74, -9, -1, 0, 14, 21 };
		assertArrayEquals(array4, array3);

	}

	@Test
	public void TesNulo() {
		BubbleSort ordena = new BubbleSort();
		int[] array5 = {};
		ordena.ordenaArray(array5);
		int[] array6 = {};
		assertArrayEquals(array6, array5);

	}

}
