/*
	[1149 문제] RGB거리
	문제 - RGB거리에 사는 사람들은 집을 빨강, 초록, 파랑중에 하나로 칠하려고 한다. 또한, 그들은 모든 이웃은 같은 색으로 칠할 수 없다는 규칙도 정했다. 
		  집 i의 이웃은 집 i-1과 집 i+1이다. 처음 집과 마지막 집은 이웃이 아니다. 
		  각 집을 빨강으로 칠할 때 드는 비용, 초록으로 칠할 때 드는 비용, 파랑으로 드는 비용이 주어질 때, 모든 집을 칠할 때 드는 비용의 최솟값을 구하는 프로그램을 작성하시오.
	입력 - 첫째 줄에 집의 수 N이 주어진다. N은 1,000보다 작거나 같다. 둘째 줄부터 N개의 줄에 각 집을 빨강으로 칠할 때, 초록으로 칠할 때, 파랑으로 칠할 때 드는 비용이 주어진다.
	출력 - 첫째 줄에 모든 집을 칠할 때 드는 비용의 최솟값을 출력한다.
	예제 입력  - 3
			 26 40 83
			 49 60 57
			 13 89 99
	예제 출력  - 96
*/

//동적계획법 , 메모이제이션(memoization) 사용 

package baekjoonJudge.num1000;

import java.util.Arrays;
import java.util.Scanner;

public class Num1149 {
	static int cost = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int houseNum ;
		int[][] arr = new int[input][3];
	
		for(int i=0 ; i<input ; i++) {
			for(int j=0 ; j<3 ; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		min(arr[0]);
		
		for(int i=1 ; i<input-1 ; i++){
			
		}
		
		min(arr[input-1]);
		
		System.out.println(cost);
		sc.close();
	}
	
	public static void min(int[] arr){
		Arrays.sort(arr);
		cost+=arr[0];
	}
	
	public static int sort(int[] arr, int no) {
		
		return 0;
	}

}
