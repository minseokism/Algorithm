/** 4. 연속된 자연수의 합으로 어떤 숫자를 표현하는 방법이 여러 가지 입니다.
 *  (1+2+3+4+5)
 *  (4+5+6)
 *  (7+8)
 *  (15)
 *  로 총 4가지가 존재합니다.
 *  숫자를 입력받아 연속된 수로 표현하는 방법의 수를 구해봅시다.
 *  예를 들어 15가 입력된다면 4를 반환해 주면 됩니다.
*/

package codingtest.company4;

import java.util.Scanner;

public class Problem04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		sc.close();
		
		System.out.println(find(input));
	}
	
	public static int find(int input) {
		int cnt = 1;
		int sum = 0;
		
		for(int i = 1 ; i < input ; i++) {
			sum = i;
			if(sum + (i+1) > input) break;
			
			for (int j = i+1 ; j < input ; j++) {
				sum += j;
				
				if (sum == input) {
					cnt++;
					break;
				} else if (sum > input) break;
			}
			
		}
		
		return cnt;

	}
	
}
