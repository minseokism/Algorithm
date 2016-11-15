/*
	[1357 문제] 뒤집힌 덧셈
	문제 - 어떤 수 X가 주어졌을 때, X의 모든 자리수가 역순이 된 수를 얻을 수 있다. Rev(X)를 X의 모든 자리수를 역순으로 만드는 함수라고 하자. 
		  예를 들어, X=123일 때, Rev(X) = 321이다. 그리고, X=100일 때, Rev(X) = 1이다.
		  두 양의 정수 X와 Y가 주어졌을 때, Rev(Rev(X) + Rev(Y))를 구하는 프로그램을 작성하시오
	입력 - 첫째 줄에 수 X와 Y가 주어진다. X와 Y는 1,000보다 작거나 같은 자연수이다.
	출력 - 첫째 줄에 문제의 정답을 출력한다.
	예제 입력  - 123 100
	예제 출력  - 223
*/

package baekjoonJudge;

import java.util.Scanner;

public class Num1357 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num1 = sc.next();
		String num2 = sc.next();

		System.out.println(rev(rev(num1)+rev(num2)+""));
		
		sc.close();
	}
	
	static int rev(String num) {
		String temp;
		temp = new StringBuffer(num).reverse().toString();
		return Integer.parseInt(temp);
	}
}