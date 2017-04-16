/** 10. '*'을 이용해 입력받은 수만큼의 높이의 다이아몬드 도형을 찍어보자 
 *  단, 입력받는 높이는 홀수여야 한다.
 * 
 *      *    
 *     ***
 *    *****
 *   *******
 *  *********
 *   *******
 *    *****
 *     ***
 *      *
 */

package codingtest.company4;

import java.util.Scanner;

public class Problem10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int halfUp = (input / 2) + 1;
		int half = input / 2;
		sc.close();
		
		for (int i = 1 ; i <= halfUp ; i++) {
			for (int j = 1 ; j <= halfUp-i ; j++) {
				System.out.print(" ");
			}
			
			for (int k = 1 ; k <= 2*i-1 ; k++) {
				System.out.print("*");
			}
	
			System.out.println();
		}
		
		for (int i = 1 ; i <= half ; i++) {
			for (int j = 1 ; j <= i ; j++) {
				System.out.print(" ");
			}
			
			for (int k = 1 ; k <= 2*(halfUp-i)-1 ; k++) {
				System.out.print("*");
			}
	
			System.out.println();
		}
		
	}
	
}