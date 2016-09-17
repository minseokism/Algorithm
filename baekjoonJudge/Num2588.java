/*
	[2753 문제] 윤년
	문제 - 연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.
		  윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때 이다.
		  예를들어, 2012년은 4의 배수라서 윤년이지만, 1900년은 4의 배수이지만, 100의 배수이기 때문에 윤년이 아니다.
		  하지만, 2000년은 400의 배수이기 때문에 윤년이다.입력 - 입력의 첫 줄에는 테스트 케이스의 개수 T가 주어진다. 
		  그 다음 줄부터 각각의 테스트 케이스에 대해 정수 a와 b가 주어진다. (1 ≤ a < 100, 1 ≤ b < 1,000,000)
	입력 - 첫째 줄에 연도가 주어진다. 연도는 1보다 크거나 같고, 4000보다 작거나 같은 자연수이다.
	출력 - 첫째 줄에 윤년이면 1, 아니면 0을 출력한다.
	예제 입력  - 2000
	예제 출력  - 1
*/

package baekjoonJudge;

import java.util.Scanner;

public class Num2588 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int year;
		if(input%4==0 && input%100!=0) {
			year=1;
		} else if(input%400==0) {
			year=1;
		} else {
			year=0;
		}
		System.out.println(year);
		sc.close();
	}

}
