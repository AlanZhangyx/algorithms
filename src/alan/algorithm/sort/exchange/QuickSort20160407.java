package alan.algorithm.sort.exchange;

/**
 * 再次practice了QuickSort<br>
 * 具体解释见我的博客：http://blog.csdn.net/u010297957/article/details/51079420<br>
 * <br>
 * <strong>Time</strong>:2016年4月7日<br>
 *
 * @version : 1.0.0
 * @author zyx
 */
public class QuickSort20160407 {
	
	public static void main(String[] args) {
		int[] array = new int[] { 5, 4, 1, 0, -1, 1, 11, -11, 21 };

		quickSort(array, 0, array.length - 1);

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	public static void quickSort(int[] array, int left, int right) {
		if (left < right) {
			int l = left, r = right;
			int key = array[left];

			while (l < r) {
				while (l < r && array[r] >= key) {
					r--;
				}
				array[l] = array[r];

				while (l < r && array[l] <= key) {
					l++;
				}
				array[r] = array[l];
			}
			array[l] = key;

			quickSort(array, left, l - 1);
			quickSort(array, r + 1, right);
		}
	}

}
