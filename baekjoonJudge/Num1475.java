/*
	[1475 문제] 방번호
	문제 - 다솜이는 은진이의 옆집에 새로 이사왔다. 다솜이는 자기 방 번호를 예쁜 플라스틱 숫자로 문에 붙이려고 한다.
		  다솜이의 옆집에서는 플라스틱 숫자를 한 세트로 판다. 한 세트에는 0번부터 9번까지 숫자가 하나씩 들어있다.
		  다솜이의 방 번호가 주어졌을 때, 필요한 세트의 개수의 최소값을 출력하시오.
		  (6은 9를 뒤집어서 이용할 수 있고, 9는 6을 뒤집어서 이용할 수 있다.)
	입력 - 첫째 줄에 다솜이의 방 번호 N이 주어진다. N은 1,000,000보다 작거나 같은 자연수이다.
	출력 - 첫째 줄에 필요한 세트의 개수를 출력한다.
	예제 입력 - 9999
	예제 출력 - 2
*/

package baekjoonJudge;

import java.util.Scanner;

public class Num1475 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		input = input.replace('9','6');
		int size = input.length();

		int[] number = new int[9];
		int max = 0;

		for (int i=0 ; i<size ; i++) {
			number[input.charAt(i)-'0']++;
		}

		if (number[6]%2 != 0) {
			number[6]++;
		}

		number[6] /= 2;

		for (int i=0 ; i<9 ; i++) {
			if(max < number[i]) max = number[i];
		}

		System.out.println(max);

	}

}