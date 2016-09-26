/*
	[1037 문제] 약수
	문제 - 양수 A가 N의 진짜 약수가 되려면, N이 A의 배수이고, A가 1과 N이 아닐 때이다. 어떤 수 N의 진짜 약수가 모두 주어질 때, N을 구하는 프로그램을 작성하시오.
	입력 - 첫째 줄에 N의 진짜 약수의 개수가 주어진다. 이 개수는 50보다 작거나 같은 자연수이다. 둘째 줄에는 N의 진짜 약수가 주어진다. 
		 1,000,000보다 작거나 같고, 2보다 크거나 같은 자연수이고, 중복되지 않는다.
	출력 - 첫째 줄에 N을 출력한다.
	예제 입력  - 2
			 4 2
	예제 출력  - 8
*/

package baekjoonJudge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Num1037 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		List<Integer> divisor = new ArrayList<Integer>();
		
		for(int i=0 ; i<count ; i++) {
			divisor.add(sc.nextInt());
		}
		
		Collections.sort(divisor);
		Collections.reverse(divisor);

		System.out.println(divisor.get(0)*divisor.get(count-1));
		sc.close();
	}

}
