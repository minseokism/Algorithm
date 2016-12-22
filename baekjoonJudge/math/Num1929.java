/*
	[1929 문제] 소수 구하기
	문제 - M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.
	입력 - 첫째 줄에 자연수 M과 N이 빈 칸을 사이에 두고 주어진다. (1≤M≤N≤1,000,000)
	출력 - 한 줄에 하나씩, 증가하는 순서대로 소수를 출력한다.
	예제 입력  - 3 16
	예제 출력  - 3
 			 5
 			 7
			 11
			 13
			 
	[ 에라토스테네스의 체 이용 ]
*/
package baekjoonJudge.math;

import java.util.ArrayList;
import java.util.Scanner;

public class Num1929 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		
		ArrayList<Boolean> primeList = new ArrayList<Boolean>(end+1);
		
		primeList.add(false);
		primeList.add(false);

		for(int i=2; i<=end; i++ )
			primeList.add(i, true);
		
		for(int i=2; (i*i)<=end; i++){
			if(primeList.get(i)){
				for(int j = i*i; j<=end; j+=i) primeList.set(j, false);
			}
		}
		
		StringBuffer sb = new StringBuffer();
		for(int i=start; i<=end; i++){
			if(primeList.get(i) == true){
				sb.append(i);
				sb.append("\n");
			}
		}
		sc.close();
		System.out.println(sb.toString());
	}
}
