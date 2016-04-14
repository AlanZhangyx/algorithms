package alan.algorithm.search;

public class BinarySearch20160411 {

	public static void main(String[] args) {
		int[] array = new int[] { -312, 0, 4, 23, 123, -123, 123, -65, 0, 4 };
		quickSort(array, 0, array.length - 1);
		// bubbleSort(array);
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		int index = binarySearch(array, 1);
		System.out.println(index);
	}

	public static int binarySearch(int[] array, int target) {
		if (array == null || array.length == 0) {
			return -1;
		}
		
		int left = 0, right = array.length - 1;
		while (left <= right) {
			int middle = (left + right) >>> 1;//使用无符号右移
			
			if (array[middle] == target) {
				return middle;
			} else {
				if (array[middle] > target) {
					right = middle - 1;
				}
				if (array[middle] < target) {
					left = middle + 1;
				}
			}
		}

		return -1;
	}

	public static void quickSort(int[] array, int left, int right) {
		if (left < right) {
			int l = left, r = right;
			int pivot = array[l];

			while (l < r) {
				while (l < r && array[r] >= pivot) {
					r--;
				}
				array[l] = array[r];

				while (l < r && array[l] <= pivot) {
					l++;
				}
				array[r] = array[l];
			}
			array[l] = pivot;

			quickSort(array, left, l - 1);
			quickSort(array, r + 1, right);
		}
	}

	public static void bubbleSort(int[] array) {
		int temp = 0;
		for (int i = 1; i < array.length; i++) {
			for (int j = 0; j < array.length - i; j++) {
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}
}
