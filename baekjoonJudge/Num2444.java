/*
	[2444 문제] 별찍기 - 7
	문제 - 예제를 보고 별찍는 규칙을 유추한 뒤에 별을 찍어 보세요.
	입력 - 첫째 줄에 N (1<=N<=100)이 주어진다.
	출력 - 첫째 줄부터 2*N-1번째 줄 까지 차례대로 별을 출력한다.
	예제 입력  - 5
	예제 출력  - 	*
			   ***
			  *****
			 *******
			*********
			 *******
			  *****
			   ***
			    *
*/

package baekjoonJudge;

import java.util.Scanner;

public class Num2444 {

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
		
		empty+=" ";
		
		for(int i=1 ; i<input ; i++) {
			System.out.print(empty.substring(input-i));
			System.out.print(star.substring(2*i+1));
			System.out.println();
		}
				
		sc.close();
	}

}
