/*
	[2588 문제] 곱셈
	문제 - (세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
	
		      472 (1)
		 	X 385 (2)
		 --------
		     2360 (3)
		    3776  (4)
		   1416   (5)
		 --------
		   181720 (6)
		
		 (1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
	입력 - 첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.
	출력 - 첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력한다.
	예제 입력  - 472
			 385
	예제 출력  - 2360
		 	 3776
			 1416
			 181720
*/

package baekjoonJudge.Num2000;

import java.util.Scanner;

public class Num2588 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int ans3 = num1*(num2/100);
		num2 = num2-(num2/100)*100;
		
		int ans2 = num1*(num2/10);
		num2 = num2-(num2/10)*10;
		
		int ans1 = num1*num2;
		
		System.out.println(ans1);
		System.out.println(ans2);
		System.out.println(ans3);
		System.out.println(ans1+ans2*10+ans3*100);
		sc.close();
	}

}
