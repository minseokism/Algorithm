/*
	[1110 문제] 더하기 사이클
	문제 - 0보다 크거나 같고, 99보다 작거나 같은 정수를 두 자리로 쓴 후(10보다 작은 자연수는 앞에 0을 붙임)에 로 시작한다. 
		   두 자리수를 더한다. 그럼, 처음 숫자의 가장 오른쪽 자리수와 앞에서 구한 합의 가장 오른쪽 자리수를 이어 붙이면 새로운 숫자를 만들 수 있다. 
		   이것을 계속 하다 보면, 원래 숫자를 얻을 수 있다. 다음 예를 보자.

		 26부터 시작한다. 2+6 = 8이다. 새로운 숫자는 68이다. 6+8 = 14이다. 
		 새로운 숫자는 84이다. 8+4 = 12이다. 새로운 숫자는 42이다. 4+2 = 6이다. 새로운 숫자는 26이다.

	         위의 예는 4번만에 원래 숫자로 돌아올 수 있다. 따라서 26의 사이클의 길이는 4이다.
		 N이 주어졌을 때, N의 사이클의 길이를 구하는 프로그램을 작성하시오.
	입력 - 첫째 줄에 N이 주어진다. N은 0보다 크거나 같고, 99보다 작거나 같은 정수이다.
	출력 - 첫째 줄에 N의 사이클 길이를 출력한다.
	예제 입력  - 26
	예제 출력  - 4
*/

package baekjoonJudge;

import java.util.Scanner;

public class Num1110 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int num=input;
		int ten=0;
		int one=0;
		int hap=0;
		int cnt=0;
		
		while(true){
			ten=num/10;
			one=num-ten*10;
			hap=ten+one;
			num=one*10+hap%10;
			cnt++;
			if(input==num) {
				break;
			}
		}
		
		System.out.println(cnt);
		sc.close();
	}

}
