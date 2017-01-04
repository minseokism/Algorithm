/*
	[1212 문제] 8진수 2진수
	문제 - 8진수가 주어졌을 때, 2진수로 변환하는 프로그램을 작성하시오.
	입력 - 첫째 줄에 8진수가 주어진다. 주어지는 수의 길이는 333,334을 넘지 않는다.
	출력 - 첫째 줄에 주어진 수를 2진수로 변환하여 출력한다. 수가 0인 경우를 제외하고는 반드시 1로 시작해야 한다.
	예제 입력  - 314
	예제 출력  - 11001100
*/

package baekjoonJudge.math;

import java.util.Scanner;

public class Num1212 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String octal = sc.next();
		StringBuilder binary = new StringBuilder();
		String temp;
		int num;

		for (int i = 0 ; i < octal.length() ; i++) {
			temp = "";
			num = Integer.parseInt(octal.charAt(i)+"");
			if(num >= 4) {
				num = num-4;
				temp +="1";
			} else {
				temp +="0";
			}

			if(num >= 2) {
				num = num-2;
				temp +="1";
			} else {
				temp +="0";
			}

			if(num >= 1) {
				temp +="1";
			} else {
				temp +="0";
			}

			if(i == 0) {
				temp = Integer.parseInt(temp)+"";
			}

			binary.append(temp);
		}

		System.out.print(binary.toString());

	}
}
