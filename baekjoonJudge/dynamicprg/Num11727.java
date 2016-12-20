/*
	[11727 문제] 2xN 타일링 2
	문제 - 2×n 직사각형을 2×1과 2×2 타일로 채우는 방법의 수를 구하는 프로그램을 작성하시오.
		  아래 그림은 2×17 직사각형을 채운 한가지 예이다.
		 
		 <https://www.acmicpc.net/upload/images/t2n2122.gif>
	입력 - 첫째 줄에 n이 주어진다. (1 ≤ n ≤ 1,000)
	출력 - 첫째 줄에 2×n 크기의 직사각형을 채우는 방법의 수를 10,007로 나눈 나머지를 출력한다.
	예제 입력 1 - 2
	예제 출력 1 - 3
	예제 입력 2 - 8
	예제 출력 2 - 171
	예제 입력 3 - 12
	예제 출력 3 - 2731
*/

package baekjoonJudge;

import java.util.Scanner;

public class Num11727 {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	    int num = sc.nextInt();
	    int[] d = new int[1001];
	    d[0] = 1;
	    d[1] = 1;
	    
	    for(int i = 2 ; i <= num ; i++) {
	    	d[i] = (d[i-1] + (2*d[i-2])) % 10007;
	    }
	    
	    System.out.println(d[num]);
	    sc.close();
	}

}
