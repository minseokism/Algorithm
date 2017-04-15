/** 2. 약수의합
 *  수를 입력받아, 약수를 모두 더한수를 구하자
 *  ex) 12 = 1,2,3,4,6,12 총합 : 28
*/

package codingtest.company4;

import java.util.Scanner;

public class Problem02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int output = 0;
		sc.close();
		
		for (int i = 1; i <= input ; i++) {
			 if (input % i == 0) output += i;
		}
		
		System.out.println(output);
	}

}
