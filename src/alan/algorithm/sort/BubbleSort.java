package alan.algorithm.sort;

public class BubbleSort {
	public static void main(String[] args) {
		//BubbleSort is likes bubble.
		int[] array={234,23,123,0,-345,123,-45,34,345,-9};
		for (int i = 0; i < array.length-1; i++) {
			for (int j = 0; j < array.length-i-1; j++) {
				if (array[j]>array[j+1]) {
					array[j]=array[j]+array[j+1];
					array[j+1]=array[j]-array[j+1];
					array[j]=array[j]-array[j+1];
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
