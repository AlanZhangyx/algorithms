package alan.algorithm.search;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchInsert {

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<Integer>();
		/*list.add(-10);
		list.add(0);
		list.add(1);
		list.add(4);
		list.add(4);
		list.add(4);
		list.add(6);*/
		
		
		list.add(3);
		list.add(5);
		list.add(7);
		
		binarySearchInsert(list,6);
		
		for(int temp:list){
			System.out.println(temp);
		}
	}
	
	/**
	 * 将一个数，插入一个有序数列，使得插入过后的数列还是有序的
	 * 改进二分查找，循环条件去掉lower==upper（此时）
	 * @param list
	 * @param des
	 */
	private static void binarySearchInsert(List<Integer> list, int des) {
		int lower=0,upper=list.size()-1;
		int oughtIndex=0;
		while (lower<upper) {
			int middle=(lower+upper)/2;
			if (des==list.get(middle)) {
				list.add(middle, des);
				return;
			}else if(des<list.get(middle)){
				upper=middle-1;
				if (lower==upper) {
					if (des<list.get(lower)) {
						oughtIndex=lower;
					}else {
						oughtIndex=middle;
					}
				}
			}else {
				lower=middle+1;
				if (lower==upper) {
					if (des<list.get(lower)) {
						oughtIndex=middle;
					}else {
						oughtIndex=lower;
					}
				}
			}
		}
		list.add(oughtIndex, des);
		return;
	}
}