/*
	[2445 문제] 별찍기 - 8
	문제 - 예제를 보고 별찍는 규칙을 유추한 뒤에 별을 찍어 보세요.
	입력 - 첫째 줄에 N (1<=N<=100)이 주어진다.
	출력 - 첫째 줄부터 2*N-1번째 줄 까지 차례대로 별을 출력한다.
	예제 입력  - 5
	예제 출력  - *        *
			 **      **
			 ***    ***
			 ****  ****
			 **********
			 ****  ****
			 ***    ***
			 **      **
			 *        *
*/

package baekjoonJudge.Num2000;

import java.util.Scanner;

public class Num2445 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int doubleInput = input*2;
		
		String empty ="";
		for(int i=0 ; i<doubleInput-2 ; i++) {
			empty+=" ";
		}
		
		for(int i=0 ; i<input ; i++) {
			for(int j=0 ; j<i+1 ; j++) {
				System.out.print("*");
			}
			
			System.out.print(empty.substring(i*2));
			
			for(int j=0 ; j<i+1 ; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		for(int i=input-1 ; i>0 ; i--) {
			for(int j=0 ; j<i ; j++) {
				System.out.print("*");
			}
			
			System.out.print(empty.substring((i-1)*2));
			
			for(int j=0 ; j<i ; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		sc.close();
	}

}