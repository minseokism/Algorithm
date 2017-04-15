/** 7. 1~1000까지의 수를 입력받고, 이를 2진수로 변환하여 보자.
 */

package codingtest.company4;

import java.util.Scanner;

public class Problem07 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		sc.close();
		
		System.out.println(tenToBinary(input));
	}
	
	public static String tenToBinary(int input) {
		StringBuilder output = new StringBuilder();
		
		while (input > 1) {
			output.append(input % 2);
			input /= 2;
		}
		output.append(input);
		
		return output.reverse().toString();
	}

}
