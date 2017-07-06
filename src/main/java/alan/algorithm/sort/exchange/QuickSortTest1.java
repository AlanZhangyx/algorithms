package main.java.alan.algorithm.sort.exchange;

import java.util.ArrayList;
import java.util.List;

public class QuickSortTest1 {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(-5);
		list.add(-6);
		list.add(0);
		list.add(2);
		list.add(0);
		list.add(-2);
		list.add(-5);
		list.add(-8);
		list.add(10);
		
		quickSort(list,0,list.size()-1);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	private static void quickSort(List<Integer> list,int head,int tail){
		//在一组数中取一个关键数，将其与数列中的其它值循环从后、从前遍历比较。大于关键值的放入后边遍历的空位置，小与的反之；
		//比较完后，将关键值放入最后比较的那个位置，此时关键值左右分别比起小和大。然后递归调用，排序关键值左右子数列。
		if(head<tail){//==说明孩子们已经处理好了，赶紧结束这递归吧，还玩个锤子
			int key=list.get(head),l=head,r=tail;
			while (l<r) {//不要==，==在下边处理list.set(l, key);
				while (l<r&&list.get(r)>=key) {
					r--;
				}
				list.set(l, list.get(r));
				while (l<r&&list.get(l)<=key) {
					l++;
				}
				list.set(r, list.get(l));
			}
			list.set(l, key);
			//递归调用
			quickSort(list,head,l-1);
			quickSort(list,l+1,tail);	
		}
	}
}