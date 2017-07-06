package main.java.alan.algorithm.sort.exchange;

import org.junit.Test;

public class BubbleSortImprove {

	/**
	 * 改进算法
	 * 最好时间复杂度为：仅进行1此外层循环就完成排序
	 * 当外层循环中的某一趟没有交换发生的话，那么此时就可以判定：排序已经完成
	 */
	@Test
	public void testImprove() {
		int[] array = new int[]{5, 4, 1, 0, -1, 1, 11, -11, 21};
		int length = array.length;
		
		for(int i = 0; i < length - 1; i ++){
			boolean didSwap = false;
			for (int j = 0; j < array.length - i - 1; j ++) {
				if (array[j] > array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					didSwap = true;
				}
			}
			if (!didSwap) {
				break;
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
	}
}
