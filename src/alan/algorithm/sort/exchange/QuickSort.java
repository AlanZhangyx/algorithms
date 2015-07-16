package alan.algorithm.sort.exchange;

public class QuickSort {

	public static void main(String[] args) {
		//int[] array={234,23,123,0,-345,123,-45,34,345,-9};
		int[] array={-5,-6,0,2,0,-2,-8,10};
		quickSort1(array,0,array.length-1);
		int i=0;
		while(array.length>i){
			System.out.println(array[i]);
			i++;
		}
	}

	
	/**
	 * 思想：递归调用实现QuickSort
	 * 1.快速排序：采用分治法（关键值分治法），每次将小于和大于key的数分别放置与其左右；
	 *   然后在左右子数组中在继续使用分治，直到左右只有一个数为止；
	 * 2.快速排序不是一种稳定的排序，元素顺序不能保证
	 * 
	 * 解题：
	 * 1.既然要递归调用，就需要控制递归的结束，那么：来一个最外层的if吧；
	 * 2.递归相当于控制：有几趟排序；还要有外层while控制一趟排序，还要有内层两个while控制控制从后往前和从前往后；
	 * 
	 * 总体：1个if3个循环，比较时等于key不取
	 * 1.[if]控制递归
	 * 2.暂存[控制递归的左右]索引
	 * 3.外层循环
	 * 4.内层循环
	 * 5.递归调用
	 * @param arrs
	 * @param left
	 * @param right
	 */
	private static void quickSort1(int[] arrs,int left,int right){
		if(left<right){
			int l=left,r=right,key=arrs[left];
			while(l<r){
				while (l<r&&arrs[r]>=key) {//只要小与key的
					r--;
				}
				arrs[l]=arrs[r];
				
				while (l<r&&arrs[l]<=key) {//只要大于key的
					l++;
				}
				arrs[r]=arrs[l];
			}
			arrs[l]=key;
			quickSort1(arrs,left,l-1);
			quickSort1(arrs,l+1,right);
		}
	}
}