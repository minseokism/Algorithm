/*
	[2407 문제] 조합
	문제 - nCm을 출력한다.
	입력 - n과 m이 주어진다. (5<=n<=100, 5<=m<=100,m<=n)
	출력 - nCm을 출력한다.
	예제 입력 - 100 6
	예제 출력 - 1192052400
*/

package baekjoonJudge.math;

import java.math.BigInteger;
import java.util.Scanner;

public class Num2407 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		System.out.println(factorial(BigInteger.valueOf(n),BigInteger.valueOf(n-m))
		.divide(factorial(BigInteger.valueOf(m),BigInteger.ONE)));
	}

	public static BigInteger factorial(BigInteger start, BigInteger end) {
		if (start.compareTo(end) == 1) {
			return start.multiply(factorial(start.subtract(BigInteger.ONE),end));
		} else {
			return BigInteger.ONE;
		}
	}

}