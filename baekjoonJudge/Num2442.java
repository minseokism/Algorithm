/*
	[2442 문제] 별찍기 - 5
	문제 - 첫째 줄에는 별 1개, 둘째 줄에는 별 3개, ..., N번째 줄에는 별 2*N-1개를 찍는 문제 별은 가운대를 기준으로 대칭이어야 한다.
	입력 - 첫째 줄에 N (1<=N<=100)이 주어진다.
	출력 - 첫째 줄부터 N번째 줄 까지 차례대로 별을 출력한다.
	예제 입력  - 5
	예제 출력  - 	*
			   ***
			  *****
			 *******
			*********
*/

package baekjoonJudge;

import java.util.Scanner;

public class Num2442 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		String empty ="";
		for(int i=0 ; i<input-1 ; i++) {
			empty+=" ";
		}
		
		String star="";	
		for(int i=0 ; i<2*input ; i++) {
			star+="*";
		}
		
		for(int i=0 ; i<input ; i++) {
			System.out.print(empty.substring(i));
			System.out.print(star.substring(2*input-2*i-1));
			System.out.println();
		}
		
		sc.close();
	}

}
