/*
	[ 선택 정렬 ]
	- 순서가 바뀌지 않는 정렬
	- 안정 정렬
	- 시간복잡도 O(N^2)
	
*/

package base.sort;

public class SelectionSort {

	public static void main(String[] args) {
		int[] sort = {8,4,17,9,12,50,3};
		int indexMin,temp;

	    for(int i:sort){
            System.out.print(i);
            System.out.print(" ");
        }
	
        for (int i = 0; i < sort.length - 1; i++)
        {
            indexMin = i;
            for (int j = i + 1; j < sort.length; j++){
                if (sort[j] < sort[indexMin])
                    indexMin = j;
            }
            temp = sort[indexMin]; 
            sort[indexMin] = sort[i];
            sort[i] = temp;
        }
        System.out.println();
	    for(int i:sort){
            System.out.print(i);
            System.out.print(" ");
        }
	}

}
