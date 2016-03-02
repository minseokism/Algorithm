/*
	[2749 문제] 피보나치 수 3
	문제 - 피보나치 수는 0과 1로 시작한다. 0번째 피보나치 수는 0이고, 1번째 피보나치 수는 1이다. 
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

/*
-피사노주기를 이용해서 문제 풀이

피보나치 수를 K로 나눈 나머지는 항상 주기를 가지게 됩니다. 이를 피사노 주기(Pisano Period)라고 합니다.
피보나치 수를 3으로 나누었을 때, 주기의 길이는 8입니다.
주기의 길이가 P이면, N번째 피보나치 수를 M으로 나눈 나머지는 N%P번째 피보나치 수를 M을 나눈 나머지와 같습니다.

*/

package baekjoonJudge;

import java.util.Scanner;

public class Num2749 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long input = sc.nextLong();
		sc.close();
		int ml=1000000;
		int fisanoPeriod = ml/10*15;
		int[] fibo=new int[fisanoPeriod+1];
		fibo[0]=0;
		fibo[1]=1;
		
		for(int i=2;i<=fisanoPeriod;i++){
			fibo[i] = fibo[i-1]+fibo[i-2];
			fibo[i] %= ml;
		}
		System.out.println(fibo[(int)(input%fisanoPeriod)]);
		
	}
}