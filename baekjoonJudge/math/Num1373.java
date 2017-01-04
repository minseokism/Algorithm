/*
	[1373 문제] 2진수 8진수
	문제 - 2진수가 주어졌을 때, 8진수로 변환하는 프로그램을 작성하시오.
	입력 - 첫째 줄에 2진수가 주어진다. 주어지는 수의 길이는 1,000,000을 넘지 않는다.
	출력 - 첫째 줄에 주어진 수를 8진수로 변환하여 출력한다.
	예제 입력  - 11001100
	예제 출력  - 314
*/

package baekjoonJudge.math;

import java.util.Scanner;

public class Num1373 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder binary = new StringBuilder();
		StringBuilder octal = new StringBuilder();

		binary.append(sc.next());
		binary.reverse();

		int num = binary.length()%3;

		if(num == 1) binary.append("00");
		if(num == 2) binary.append("0");

		int size = binary.length();

		for(int i = size%3 ; i < size ; i += 3) {
			octal.append(Integer.parseInt(binary.charAt(i) + "") +
					(Integer.parseInt(binary.charAt(i + 1) + "") * 2) +
					(Integer.parseInt(binary.charAt(i + 2) + "") * 4));
		}

		System.out.print(octal.reverse().toString());

	}
}
