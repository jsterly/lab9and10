package lab9and10;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SelectionSortTest {

	@Test
	public void test() {
	testPositive();
	testNegative();
	testZeros();
	testDuplicates();
	testMixed();
	}

	public SelectionSortTest() {
	}

	public void testPositive() {
		int[]arr = new int[5];
		arr[0] = 8;
		arr[1] = 9;
		arr[2] = 7;
		arr[3] = 10;
		arr[4] = 2;

		int[] Sortedarr = new int[5];
		Sortedarr[0] = 2;
		Sortedarr[1] = 7;
		Sortedarr[2] = 8;
		Sortedarr[3] = 9;
		Sortedarr[4] = 10;

		SelectionSort templ = new SelectionSort();
		int[] x = templ.basicSelectionSort(arr);


		for(int i = 0; i < arr.length; i++)
		{
			assertEquals("Not equal",x[i], Sortedarr[i]);
		}

	}//end testPositive

	public void testNegative()
	{
		int[]arr = new int[5];
		arr[0] = -2;
		arr[1] = -9;
		arr[2] = -5;
		arr[3] = -27;
		arr[4] = -1;

		int[] Sortedarr = new int[5];
		Sortedarr[0] = -27;
		Sortedarr[1] = -9;
		Sortedarr[2] = -5;
		Sortedarr[3] = -2;
		Sortedarr[4] = -1;

		SelectionSort templ = new SelectionSort();
		int[] x = templ.basicSelectionSort(arr);


		for(int i = 0; i < arr.length; i++)
		{
			assertEquals("Not equal",x[i], Sortedarr[i]);
		}
	}

	public void testZeros()
	{
		int[]arr = new int[5];
		arr[0] = 0;
		arr[1] = 0;
		arr[2] = 0;
		arr[3] = 0;
		arr[4] = 0;

		int[] Sortedarr = new int[5];
		Sortedarr[0] = 0;
		Sortedarr[1] = 0;
		Sortedarr[2] = 0;
		Sortedarr[3] = 0;
		Sortedarr[4] = 0;

		SelectionSort templ = new SelectionSort();
		int[] x = templ.basicSelectionSort(arr);


		for(int i = 0; i < arr.length; i++)
		{
			assertEquals("Not equal",x[i], Sortedarr[i]);
		}
	}
	public void testDuplicates()
	{
		int[]arr = new int[5];
		arr[0] = 7;
		arr[1] = 9;
		arr[2] = 4;
		arr[3] = 9;
		arr[4] = 7;

		int[] Sortedarr = new int[5];
		Sortedarr[0] = 4;
		Sortedarr[1] = 7;
		Sortedarr[2] = 7;
		Sortedarr[3] = 9;
		Sortedarr[4] = 9;

		SelectionSort templ = new SelectionSort();
		int[] x = templ.basicSelectionSort(arr);


		for(int i = 0; i < arr.length; i++)
		{
			assertEquals("Not equal",x[i], Sortedarr[i]);
		}	}

	public void testMixed()
	{
		int[]arr = new int[5];
		arr[0] = -4;
		arr[1] = 3;
		arr[2] = 0;
		arr[3] = 12;
		arr[4] = 3;

		int[] Sortedarr = new int[5];
		Sortedarr[0] = -4;
		Sortedarr[1] = 0;
		Sortedarr[2] = 3;
		Sortedarr[3] = 3;
		Sortedarr[4] = 12;

		SelectionSort templ = new SelectionSort();
		int[] x = templ.basicSelectionSort(arr);


		for(int i = 0; i < arr.length; i++)
		{
			assertEquals("Not equal",x[i], Sortedarr[i]);
		}
	}


}
