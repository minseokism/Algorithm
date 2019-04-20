/*
	[1152 문제] 단어의 개수
	문제 - 영어 대소문자와 띄어쓰기만으로 이루어진 문장이 주어진다. 이 문장에는 몇 개의 단어가 있을까? 
		   이를 구하는 프로그램을 작성하시오. 단, 단어는 띄어쓰기 하나로 구분된다고 생각한다.
	입력 - 첫 줄에 영어 대소문자와 띄어쓰기로 이루어진 문장이 주어진다. 이 문장의 길이는 1,000,000을 넘지 않는다.
	출력 - 첫째 줄에 단어의 개수를 출력한다.
	예제 입력  - The Curious Case of Benjamin Button
	예제 출력  - 6
*/

package baekjoonJudge.num1000;

import java.util.Scanner;

public class Num1152 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		String st = sc.nextLine();	
		int cnt=0;		
		int length = st.length();
		if(st.charAt(0)!=32) cnt++;
		
		for(int i=0 ; i<length ; i++) {
		
			if(st.charAt(i)==32) {
				if (i!=length-1 && st.charAt(i+1)!=32) cnt++;
			}
		}
		
		System.out.println(cnt);
		sc.close();
	}

}
