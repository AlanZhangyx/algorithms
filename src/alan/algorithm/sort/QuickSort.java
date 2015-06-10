package alan.algorithm.sort;

public class QuickSort {

	public static void main(String[] args) {
		int[] array={234,23,123,0,-345,123,-45,34,345,-9};
		quickSort(array,0,array.length);
	}

	/**
	 * 递归调用实现快速排序
	 * 快速排序：采用分支法，每次将小于和大于key的数分别放置与其左右；
	 * 然后在左右子数组中在继续使用分支，指导左右只有一个数为止；
	 * 快速排序不是一种稳定的排序，元素顺序不能保证
	 * @param arrays
	 * @param left
	 * @param right
	 */
	public static void quickSort(int[] arrays,int left,int right){
		int key=arrays[left];
		while(left<right){
			if (arrays[right]<key) {
				arrays[right]=arrays[right]+arrays[left];
				arrays[left]=arrays[right]-arrays[left];
				arrays[right]=arrays[right]-arrays[left];
				right--;
			}
		}
	}
}