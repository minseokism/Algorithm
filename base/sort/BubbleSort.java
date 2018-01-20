/*
	[ 버블 정렬 ]
	- 순서가 바뀌지 않는 정렬
	- 안정 정렬
	- 시간복잡도 최선, 최악, 평균 다 O(N^2)
	
*/

package base.sort;

public class BubbleSort {
	
	public static void main(String[] args) {
		int[] sort = {8,4,17,9,12,50,3};
		int temp;
		for(int i=0; i<sort.length;i++){
			System.out.print(sort[i]+" ");
		}
		for(int i=0 ; i<sort.length-1 ; i++){
			for(int j=0 ; j<sort.length-1-i ; j++){
				if(sort[j]>sort[j+1]){
					temp=sort[j];
					sort[j]=sort[j+1];
					sort[j+1]=temp;
				}
			}
		}
		System.out.println();
		for(int i=0; i<sort.length;i++){
			System.out.print(sort[i]+" ");
		}
	}

}
