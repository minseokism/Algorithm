/*
	[1157] 단어 공부
	문제 - 알파벳 대소문 자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오.
		  단, 대문자와 소문자를 구분하지 않는다.
	입력 - 첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.
	출력 - 첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다.
		  단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
	예제 입력 - Mississipi
	예제 출력 - ?
*/

package baekjoonJudge.num1000;

import java.util.Scanner;

public class Num1157 {

	static int[] alphabet = new int[26];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		input = input.toUpperCase();

		int max = -1;
		char maxChar ='?';
		String output = "";

		for(int i = 0 ; i<input.length() ; i++) {
			alphabet[input.charAt(i)-65]++;
		}

		for(int i = 0 ; i<alphabet.length ; i++) {
			if(max < alphabet[i]) {
				max = alphabet[i];
				maxChar = (char)(65+i);
				output = maxChar+"";
			} else if(max == alphabet[i]) {
				output="?";
			}
		}

		System.out.print(output);
	}
	
}
