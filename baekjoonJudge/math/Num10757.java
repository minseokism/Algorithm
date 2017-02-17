/*
	[10757 문제] 큰 수 A+B
	문제 - A+B를 계산하시오.
	입력 - 첫째 줄에 A와 B가 주어진다. (0 < A,B < 10^10000)
	출력 - 첫째 줄에 A+B를 출력한다.
	예제 입력 - 9223372036854775807 9223372036854775808
	예제 출력 - 18446744073709551615
*/
package baekjoonJudge.math;

import java.math.BigInteger;
import java.util.Scanner;

public class Num10757 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger num1 = sc.nextBigInteger();
		BigInteger num2 = sc.nextBigInteger();

		System.out.println(num1.add(num2));
	}
}