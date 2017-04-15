/** 9. 음수가 아닌 수들이 주어졌을 때 그 수들을 이어서 만들 수 있는 가장 큰 수를 구하시오.
 *  단, 수는 5개를 입력받는다.
 *  [3, 30, 34, 5, 9] 가 주어지면 만들 수 있는 가장 큰 수는 9534330이다.
 */

package codingtest.company4;

import java.util.Scanner;

public class Problem09 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		
		for (int i = 0 ; i < 5 ; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		System.out.println(makeMaxNum(arr));
	}
	
	public static String makeMaxNum(int[] arr) {
		String[] strArr = new String[5];
		
		for (int i = 0 ; i < 5 ; i++) {
			strArr[i] = String.valueOf(arr[i]);
		}
		
		for (int i = 0 ; i < 4 ; i++) {
			for (int j = i + 1 ; j < 5 ; j++) {
				int num1 = Integer.parseInt(strArr[i] + strArr[j]);
				int num2 = Integer.parseInt(strArr[j] + strArr[i]);
				String temp;
				
				if (num1 < num2) {
					temp = strArr[i];
					strArr[i] = strArr[j];
					strArr[j] = temp;
				}
			}
		}
		
		return arrToString(strArr);
	}
	
	public static String arrToString(String[] strArr) {
		StringBuilder sb = new StringBuilder();
		
		for (String str : strArr) {
			sb.append(str);
		}
		
		return sb.toString();
	}
}
