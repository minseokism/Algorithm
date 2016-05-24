/*
	[1463 문제] 1로 만들기
	문제 - 세준이는 어떤 정수 N에 다음과 같은 연산중 하나를 할 수 있다.
		  1. N이 3으로 나누어 떨어지면, 3으로 나눈다.
		  2. N이 2로 나누어 떨어지면, 2로 나눈다.
		  3. 1을 뺀다.
		   세준이는 어떤 정수 N에 위와 같은 연산을 선택해서 1을 만드려고 한다. 연산을 사용하는 횟수의 최소값을 출력하시오.
	입력 - 첫째 줄에 1보다 크거나 같고, 10^6보다 작거나 같은 자연수 N이 주어진다.
	출력 - 첫째 줄에 연산을 하는 횟수의 최소값을 출력한다.
	예제 입력 1 - 2
	예제 출력 1 - 1
	예제 입력 2 - 10
	예제 출력 2 - 3  				
*/
package baekjoonJudge;

import java.util.Scanner;

public class Num1463 {
	
	static int[] dp = new int[1000001];
	static int n ;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for (int i = 2; i <= n; i++){
	        dp[i] = dp[i - 1] + 1;
	        if (i % 2 == 0) dp[i] = min(dp[i], dp[i / 2] + 1);
	        if (i % 3 == 0) dp[i] = min(dp[i], dp[i / 3] + 1);
		}
		System.out.println(dp[n]);
		
		sc.close();
	}
	
	public static int min(int x, int y) {
		return x < y ? x : y;
	}
}
