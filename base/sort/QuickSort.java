package base.sort;

import java.util.Arrays;

public class QuickSort {
	public int partition(int list[],int left,int right){
		int pivot,temp;
		int high,low;
		
		low=left;
		high=right;
		pivot=list[left];
		
		while(low<high){
			do{
				low++;
			}while(low<=right && list[low]<pivot);
			
			while(high>=left && list[high]>pivot){
				high--;
			}
			
			if(low<high){
				temp=list[low];
				list[low]=list[high];
				list[high]=temp;
			}
			
		}
		
		temp=list[left];
		list[left]=list[high];
		list[high]=temp;
		return high;
	}
	
	public void quickSort(int list[] , int left, int right){
		if(left<right){
			int q=this.partition(list, left, right);
			quickSort(list, left, q-1);
			quickSort(list, q+1, right);
		}
	}
	public static void main(String[] args) {
		int[] sort = {8,4,17,9,12,50,3};
		QuickSort quick = new QuickSort();
		//입력
		System.out.println(Arrays.toString(sort));
	    quick.quickSort(sort, 0, sort.length-1);
	    //출력
	    System.out.println(Arrays.toString(sort));
	}

}
