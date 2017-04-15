/** 1. 피보나치 수열
 *  앞의 두 수를 더하여 다음 수를 만들어 나가는 수열이다.
 *  (ex. 1, 1, 2, 3, 5, 8, 13, 21 ..... )
 *  피보나치 수열의 50번째 수는 무엇인지 계산하는 프로그램 작성
*/

package codingtest.company4;

public class Problem01 {
	static long[] fiboArr = new long[100];
	
	public static void main(String[] args) {
		System.out.println(fibo(50));
	}
	
	public static long fibo(int input) {
		if (input <= 1) {
			return input;
		} else if (fiboArr[input] != 0) {
			return fiboArr[input];
		} else {
			return fiboArr[input] = fibo(input - 1) + fibo(input - 2);
		}
		
	}

}
