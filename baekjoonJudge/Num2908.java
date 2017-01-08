/*
	[2908 문제] 상수
	문제 - 상근이의 동생 상수는 수학을 정말 못한다. 상수는 숫자를 읽는데 문제가 있다.
		  이렇게 수학을 못하는 상수를 위해서 상근이는 수의 크기를 비교하는 문제를 내주었다.
		  상근이는 세 자리 숫자 두 개를 칠판에 써주었다. 그 다음에 크기가 큰 수를 말해보라고 했다.
		  상수는 수를 다른사람과 다르게 거꾸로 읽는다. 예를 들어, 734과 893을 칠판에 적었다면,
		  상수는 이 수를 437과 398로 읽는다. 따라서, 상수는 두 수중 큰 수인 437을 큰 수라고 말할 것이다.
		  두 수가 주어졌을 때, 상수의 대답을 출력하는 프로그램을 작성하시오.
	입력 - 첫째 줄에 상근이가 칠판에 적은 두 수 A와 B가 주어진다. 두 수는 같지 않으며, 0이 포함되어 있지 않다.
	출력 - 첫째 줄에 상수의 대답을 출력한다.
	예제 입력 - 734 893
	예제 출력 - 437
*/

package baekjoonJudge;

import java.util.Scanner;

public class Num2908 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();

		sb1.append(sc.next());
		sb2.append(sc.next());

		sb1.reverse();
		sb2.reverse();

		int num1 = Integer.parseInt(sb1.toString());
		int num2 = Integer.parseInt(sb2.toString());

		int out = num1 > num2 ? num1 : num2;

		System.out.println(out);
	}
}


