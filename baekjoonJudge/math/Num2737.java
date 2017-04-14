/*
	[2737 문제] 연속합
	문제 - 대부분의 양의 정수는 적어도 2개 이상의 연속된 자연수의 합으로 나타낼 수 있다. 예를 들면 다음과 같다.	

	6 = 1 + 2 + 3
	9 = 5 + 4 = 4 + 3 + 2

	하지만, 8은 연속된 자연수 합으로 나타낼 수가 없다. 자연수 N이 주어졌을 때, 이 수를 적어도 2개 이상의 연속된 자연수의 합으로 나타낼 수 있는 경우의 수를 출력하시오.
	입력 - 첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 정수 하나로 이루어져 있다. 이 정수는 문제에서 설명한 N이며, 2^31보다 작다.
	출력 - 각 테스트 케이스에 대해서 N을 적어도 2개 이상의 연속된 자연수의 합으로 나타내는 경우의 수를 출력한다.
	예제 입력  - 
	7
	6
	9
	8
	1800
	987654321
	987654323
	987654325
	예제 출력  - 
	1
	2
	0
	8
	17
	1
	23
*/

package baekjoonJudge.math;

import java.util.Scanner;

public class Num2737 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();

		for (int i = 0 ; i < input ; i++) {
			System.out.println(find(sc.nextInt()));
		}
		
		sc.close();
	}
	
	public static int find(int input) {
	    int count = 0;
	    
	    for (int i = 2 ; (i * (i + 1)) / 2 <= input ; i++){
		    if(i % 2 == 1) {
		    	if(input % i == 0) count++;
		    }
		    else{
			    if(input % i == i/2) count++;
		    }
	    }
	    
	    return count;

	}
	
}