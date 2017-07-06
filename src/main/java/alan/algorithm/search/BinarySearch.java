package main.java.alan.algorithm.search;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arrs={-10,0,1,4,5,9};
		System.out.println(binarySearch(arrs,5));
	}
	
	/**
	 * 有序数列
	 * 记录两个关键值，低位(low)和高位(high),操作这两个关键值：
	 * 1 如果low>high了，那么说明没找到返回-1
	 * 2 如果low<=high，进行循环
	 * 3 计算出middle
	 * 	如果des==arr[middle] return middle;
	 * 	如果des<arrs[middle] high=middle-1;
	 * 	否则low=middle+1;
	 * @param arrs
	 * @param des
	 * @return
	 */
	static int binarySearch(int[] arrs,int des){
		int low=0,high=arrs.length-1;
		while (low<=high) {
			int middle=(low+high)/2;
			if (des==arrs[middle]) {
				return middle;
			}else if(des<arrs[middle]){
				high=middle-1;
			}else{
				low=middle+1;
			}
		}
		return -1;
	}
}