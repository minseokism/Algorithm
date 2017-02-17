/*
	[10827 문제] a^b
	문제 - 실수 a와 정수 b가 주어졌을 때, a의 b제곱을 정확하게 계산하는 프로그램을 작성하시오.
	입력 - 첫째 줄에 a와 b가 주어진다. (0 < a < 100, 1 ≤ b ≤ 100) a는 최대 소수점 9자리이며, 소수가 0으로 끝나는 경우는 없다.
	출력 - 첫째 줄에 a의 b제곱을 출력한다.
	예제 입력 1 - 3.141592 3
	예제 출력 1 - 31.006257328285746688
	예제 입력 2 - 0.1 10
	예제 출력 2 - 0.0000000001
	예제 입력 3 - 1.01 5
	예제 출력 3 - 1.0510100501

*/
package baekjoonJudge.math;

import java.math.BigDecimal;
import java.util.Scanner;

public class Num10827 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigDecimal bd = sc.nextBigDecimal();
		int integer = sc.nextInt();

		System.out.println(bd.pow(integer).toPlainString());
	}
}
