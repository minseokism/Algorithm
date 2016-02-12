/*
	[2749 문제] 피보나치 수는 0과 1로 시작한다. 0번째 피보나치 수는 0이고, 1번째 피보나치 수는 1이다. 
			    그 다음 2번째 부터는 바로 앞 두 피보나치 수의 합이 된다.
			    이를 식으로 써보면 Fn = Fn-1 + Fn-2 (n>=2)가 된다.
			  n=17일때 까지 피보나치 수를 써보면 다음과 같다.
			  0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597
			  n이 주어졌을 때, n번째 피보나치 수를 구하는 프로그램을 작성하시오.
	입력 - 첫째 줄에 n이 주어진다. n은 1,000,000,000,000,000,000보다 작거나 같은 자연수이다.
	출력 - 첫째 줄에 n번째 피보나치 수를 1,000,000으로 나눈 나머지를 출력한다.
	예제 입력  - 1000
	예제 출력  - 228875
	
*/

//큰 범위를 해결못함 
//미제

import java.math.BigInteger;
import java.util.Scanner;

public class Num2749 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long input = sc.nextLong();
		sc.close();

		BigInteger num1=BigInteger.ZERO;
		BigInteger num2=BigInteger.ONE;
		BigInteger num3=null;
		
		for(long i=2L;i<=input;i++){
			System.out.println(i);
			num3=num1.add(num2);
			num1=num2;
			num2=num3;
		}
		System.out.println(num3);
		System.out.println(num3.remainder(BigInteger.valueOf(1000000L)));
	}
	
}