package test;

public class Sorting {

	/*
	 * HeapSort
	 * worst-case O(n log n), best-case O(n log n), average O(n log n)
	 */
	public void heapsort(int arr[]) {
		int n = arr.length;

		// Build heap (rearrange array)
		for (int i = n / 2 - 1; i >= 0; i--)
			heapify(arr, n, i);

		// One by one extract an element from heap
		for (int i = n - 1; i >= 0; i--) {
			// Move current root to end
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;

			// call max heapify on the reduced heap
			heapify(arr, i, 0);
		}
	}

	// To heapify a subtree rooted with node i which is
	// an index in arr[]. n is size of heap
	void heapify(int arr[], int n, int i) {
		int largest = i; // Initialize largest as root
		int l = 2 * i + 1; // left = 2*i + 1
		int r = 2 * i + 2; // right = 2*i + 2

		// If left child is larger than root
		if (l < n && arr[l] > arr[largest])
			largest = l;

		// If right child is larger than largest so far
		if (r < n && arr[r] > arr[largest])
			largest = r;

		// If largest is not root
		if (largest != i) {
			int swap = arr[i];
			arr[i] = arr[largest];
			arr[largest] = swap;

			// Recursively heapify the affected sub-tree
			heapify(arr, n, largest);
		}
	}

	/*
	 * QuickSort worse case O(n^2), average case O(nlogn)
	 */
	public void quickSort1(int[] numbers, int low, int high) {
		int i = low, j = high;
		// Get the pivot element from the middle of the list
		int pivot = numbers[low + (high - low) / 2];

		// Divide into two lists
		while (i <= j) {
			// If the current value from the left list is smaller then the pivot
			// element then get the next element from the left list
			while (numbers[i] < pivot) {
				i++;
			}
			// If the current value from the right list is larger then the pivot
			// element then get the next element from the right list
			while (numbers[j] > pivot) {
				j--;
			}

			// If we have found a values in the left list which is larger then
			// the pivot element and if we have found a value in the right list
			// which is smaller then the pivot element then we exchange the
			// values.
			// As we are done we can increase i and j
			if (i <= j) {
				exchange(numbers, i, j);
				i++;
				j--;
			}
		}
		// Recursion
		if (low < j)
			quickSort1(numbers, low, j);
		if (i < high)
			quickSort1(numbers, i, high);
	}

	private void exchange(int[] numbers, int i, int j) {
		int temp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = temp;
	}

	/*
	 * This function takes last element as pivot, places the pivot element at
	 * its correct position in sorted array, and places all smaller (smaller
	 * than pivot) to left of pivot and all greater elements to right of pivot
	 */
	private int partition(int arr[], int low, int high) {
		int pivot = arr[high];
		int i = (low - 1); // index of smaller element
		for (int j = low; j <= high - 1; j++) {
			// If current element is smaller than or
			// equal to pivot
			if (arr[j] <= pivot) {
				i++;

				// swap arr[i] and arr[j]
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		// swap arr[i+1] and arr[high] (or pivot)
		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;

		return i + 1;
	}

	/*
	 * The main function that implements QuickSort() arr[] --> Array to be
	 * sorted, low --> Starting index, high --> Ending index
	 */
	void quickSort2(int arr[], int low, int high) {
		if (low < high) {
			/*
			 * pi is partitioning index, arr[pi] is now at right place
			 */
			int pi = partition(arr, low, high);

			// Recursively sort elements before
			// partition and after partition
			quickSort2(arr, low, pi - 1);
			quickSort2(arr, pi + 1, high);
		}
	}

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
		// Copy the remaining elements of L[], if there are any
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
