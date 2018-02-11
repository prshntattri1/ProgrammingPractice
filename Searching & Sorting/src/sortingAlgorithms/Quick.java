package sortingAlgorithms;

public class Quick {

	public static void sort(int[] A) {
		Quick q = new Quick();
		q.quickSort(A, 0, A.length - 1);
	}

	public void quickSort(int[] A, int low, int high) {
		int pivot;
		if (high > low) {
			pivot = partition(A, low, high);
			quickSort(A, low, pivot - 1);
			quickSort(A, pivot + 1, high);
		}
	}

	public int partition(int[] A, int low, int high) {
		int left, right, pivot = A[low];
		left = low;
		right = high;
		while (right > left) {
			while (A[left] <= pivot)
				left++;
			while (A[right] > pivot)
				right--;
			if (left < right) {
				int temp = A[left];
				A[left] = A[right];
				A[right] = temp;
			}
		}
		A[low] = A[right];
		A[right] = pivot;
		return right;
	}
}
