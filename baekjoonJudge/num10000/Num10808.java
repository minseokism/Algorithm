/*
	[10808 문제] 알파벳 개수
	문제 - 알파벳 소문자로만 이루어진 단어 S가 주어진다. 이 때, 각 알파벳이 단어에 몇 개가 포함되어 있는지 구하는 프로그램을 작성하시오.
	입력 - 첫째 줄에 단어 S가 주어진다. 단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.
	출력 - 단어에 포함되어 있는 a의 개수, b의 개수, …, z의 개수를 공백으로 구분해서 출력한다.
	예제 입력 - baekjoon
	예제 출력 - 1 1 0 0 1 0 0 0 0 1 1 0 0 1 2 0 0 0 0 0 0 0 0 0 0 0
*/

package baekjoonJudge.Num10000;

import java.util.Scanner;

public class Num10808 {

	public static void main(String[] args) {
		int[] arr = new int[26];
		
		for(int i = 0 ; i<26 ; i++) {
			arr[i] = 0;
		}
		
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		int length = input.length();
		int temp ;
		StringBuilder sb = new StringBuilder();
		
		
		if(input.matches("^[a-z]{0,101}$")) {
			for(int i = 0 ; i<length ; i++) {
				temp = input.charAt(i) - 97;
				if(temp >= 0 && temp < 26) arr[temp]++;					

			}
		
			for(int i = 0 ; i<25 ; i++) {
				sb.append(arr[i]);
				sb.append(" ");
			}
			sb.append(arr[25]);
			
			System.out.println(sb);
		}
		sc.close();
	}

}
