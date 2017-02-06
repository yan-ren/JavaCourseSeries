package test;

public class Sorting {
	/*
	 * QuickSort
	 */
	
	/*
	 * Insertion Sort sorted - all items to the left are smaller O(n^2)
	 */
	public int[] insertionSort(int[] list) {
		int i, j, key, temp;
		for (i = 1; i < list.length; i++) {
			key = list[i];
			j = i - 1;
			while (j >= 0 && key < list[j]) {
				// swap
				temp = list[j];
				list[j] = list[j + 1];
				list[j + 1] = temp;
				j--;
			}
		}
		return list;
	}

	/*
	 * Merge Sort does log(n) merge steps, does n work for each merge step.
	 */
	public void mergeSort(int[] list, int lowIndex, int highIndex) {
		if (lowIndex == highIndex)
			return;
		else {
			int midIndex = (lowIndex + highIndex) / 2;
			mergeSort(list, lowIndex, midIndex);
			mergeSort(list, midIndex + 1, highIndex);
			merge(list, lowIndex, midIndex, highIndex);
		}
	}

	private void merge(int[] list, int lowIndex, int midIndex, int highIndex) {
		int[] L = new int[midIndex - lowIndex + 1];
		int[] R = new int[highIndex - midIndex];

		for (int i = 0; i < L.length; i++) {
			L[i] = list[lowIndex + i];
		}

		for (int i = 0; i < R.length; i++) {
			R[i] = list[midIndex + 1 + i];
		}

		int i = 0, j = 0, k = lowIndex;
		while (i < midIndex - lowIndex + 1 && j < highIndex - midIndex) {
			if (L[i] <= R[j]) {
				list[k] = L[i];
				i++;
			} else {
				list[k] = R[j];
				j++;
			}
			k++;
		}
		//Copy the remaining elements of L[], if there are any 
		while (i < midIndex - lowIndex + 1) {
			list[k] = L[i];
			i++;
			k++;
		}
		// Copy the remaining elements of R[], if there are any
		while (j < highIndex - midIndex) {
			list[k] = R[j];
			j++;
			k++;
		}
	}

}
