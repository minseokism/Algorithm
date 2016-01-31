/*
	[11726 문제] 0보다 크거나 같은 정수 N이 주어진다. 이 때, N!을 출력하는 프로그램을 작성하시오.
	입력 - 첫째 줄에 정수 N(0 ≤ N ≤ 12)가 주어진다.
	출력 - 첫째 줄에 N!을 출력한다.
	예제 입력  - 10
	예제 출력  - 3628800
*/

//static 으로 만든 method 불러오는거랑, 객체를 생성해서 메소드를 사용하는경우의 차이...?

import java.util.Scanner;

public class Num11726 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		sc.close();
		System.out.println(fac(input));
		
	}
	static int fac(int i){
		if(i==0){
			return 1;
		}else{
			return i*fac(i-1);
		}
	}
}
