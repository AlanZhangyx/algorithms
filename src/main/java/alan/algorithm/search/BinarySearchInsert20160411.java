package main.java.alan.algorithm.search;

public class BinarySearchInsert20160411 {

	public static void main(String[] args) {
		int[] array = new int[] { -312, -111, 0, 0, 4, 23, 123, 123 };

		//int index = getInsertIndexGeneral(array, 4);
		int index2 = getInsertIndexBinary(array, -333);
		System.out.println(index2);

		/*int[] array2 = copyAndInsert(array, 4, index);
		for (int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}*/
	}

	private static int getInsertIndexGeneral(int[] array, int i) {
		for (int j = 0; j < array.length; j++) {
			if (array[j] < i) {
				j++;
			} else if (array[j] == i) {
				return j;
			} else {
				return j - 1;
			}
		}
		return -1;
	}

	private static int getInsertIndexBinary(int[] array, int target) {
		int left = 0, right = array.length - 1;
		while (left <= right) {
			int middle = (left + right) >>> 1;
			if (array[middle] == target) {
				return middle;
			} else if (array[middle] > target) {
				right = middle - 1;
			} else {
				left = middle + 1;
			}
		}

		return left;
	}

	private static int[] copyAndInsert(int[] array, int target, int index) {
		int[] array2 = new int[array.length + 1];
		for (int i = 0, j = 0; i < array2.length; i++, j++) {
			if (i == index) {
				array2[i] = target;
				i++;
			}
			array2[i] = array[j];
		}
		return array2;
	}

}
