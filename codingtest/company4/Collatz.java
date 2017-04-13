/**
 *  [문제 3] 콜라츠 추측
 *  1937년 Collatz란 사람에 의해 제기된 이 추측은, 입력된 수가 짝수라면 2로 나누고, 홀수라면 3을 곱하고 1을 더한 다음,
 *  결과로 나온 수에 같은 작업을 1이 될 때까지 반복할 경우 모든 수가 1이 된다는 추측입니다.
 *  예를 들어, 입력된 수가 6이라면 6->3->10->5->16->8->4->2->1 이 되어 총 8번 만에 1이 됩니다.
 *  collatz 함수를 만들어 입력된 수가 몇번 만에 1이 되는지 반환해 주세요.
 *  단, 500번을 반복해도 1이 되지 않는다면 ?1을 반환해 주세요
*/

package codingtest.company4;

import java.util.Scanner;

public class Collatz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		System.out.println(collatz(input));
		sc.close();
	}
	
	public static String collatz(int input) {
		int cnt = 0;
		
		while (input != 1) {
			if (input % 2 == 0) input = evenCase(input);
			else input = oddCase(input);
			
			cnt++;
			if (cnt >= 500) {
				return "?1";
			}
		}
		
		return cnt + "";
	}
	 
	public static int evenCase(int input) {
		return input / 2;
	}
	
	public static int oddCase(int input) {
		return input * 3 + 1;
	}
	
}
