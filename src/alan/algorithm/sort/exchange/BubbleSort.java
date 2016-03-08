package alan.algorithm.sort.exchange;



/**
 * 交换排序：根据序列中两个键值的比较结果来对换他们在序列中的位置。
 * 通常将键值大的移到队尾，将键值小的移到队首。
 * Introduction this Type.
 * 
 * @author ZhangYaxu
 * @date Jul 16, 2015
 */
public class BubbleSort {
	public static void main(String[] args) {
		// BubbleSort is likes bubble.
		int[] array = { 234, 23, 123, 0, -345, 123, -45, 34, 345, -9 };
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					array[j] = array[j] + array[j + 1];
					array[j + 1] = array[j] - array[j + 1];
					array[j] = array[j] - array[j + 1];
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
