/*
	[1427 문제] 소트인사이드
	문제 - 배열을 정렬하는 것은 쉽다. 숫자가 주어지면, 그 숫자의 각 자리수를 내림차순으로 정렬해보자.
	입력 - 첫째 줄에 정렬하고자하는 수 N이 주어진다. N은 1,000,000,000보다 작거나 같다.
	출력 - 둘째 줄에 숫자의 자리수를 내림차순으로 정렬한 수를 출력한다.
	예제 입력 - 2143
	예제 출력 - 4321
*/
package baekjoonJudge.num1000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Num1427 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		int size = input.length();
		List<Integer> ls = new ArrayList();
		StringBuilder output = new StringBuilder();

		for (int i = 0 ; i<size ; i++) {
			ls.add(input.charAt(i)-48);
		}

		Collections.sort(ls);
		Collections.reverse(ls);

		for (Integer i : ls) {
			output.append(i);
		}

		System.out.println(output.toString());
	}

}
