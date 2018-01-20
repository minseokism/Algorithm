/*
	[ 삽입 정렬 ]
	- 순서가 바뀌지 않는 정렬
	- 안정 정렬
	- 시간복잡도 O(N^2)
	- 이미 정렬 되어있는 리스트에 조금씩 업데이트 되는 경우 빠르다 but 퀵소트의 경우 최악의 시간이 걸린다 O(N^2)
*/

package base.sort;

public class InsertionSort {

	public static void main(String[] args) {
		int[] sort = {8,4,17,9,12,50,3};

		//입력
	    for(int i:sort){
            System.out.print(i);
            System.out.print(" ");
        }
	    
	    for(int i=1;i<sort.length;i++){
	    	int key=sort[i];
	    	int j=i-1;
	    	while(j>=0 && sort[j]>key){
	    		sort[j+1]=sort[j];
	    		j=j-1;
	    	}
	    	sort[j+1]=key;
	    }
	    
	    //출력
	    System.out.println();
	    for(int i:sort){
            System.out.print(i);
            System.out.print(" ");
        }
	}

}
