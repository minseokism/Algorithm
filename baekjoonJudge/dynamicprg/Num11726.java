/*
	[11726 문제] 2×n 크기의 직사각형을 1×2, 2×1 타일로 채우는 방법의 수를 구하는 프로그램을 작성하시오.
			       아래 그림은 2×5 크기의 직사각형을 채운 한 가지 방법의 예이다.
			       이미지 참조 : https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/11726/1.png
			       문제 참조 : https://www.acmicpc.net/problem/11726
	입력 - 첫째 줄에 n이 주어진다. (1 ≤ n ≤ 1,000)
	출력 - 첫째 줄에 2×n 크기의 직사각형을 채우는 방법의 수를 10,007로 나눈 나머지를 출력한다.
	예제 입력 1 - 2
	예제 출력 1 - 2
	예제 입력 2 - 9
	예제 출력 2 - 55	
*/

package baekjoonJudge.dynamicprg;

import java.util.Scanner;

public class Num11726 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		sc.close();
		int[] fibo=new int[1001];
		fibo[0]=0;
		fibo[1]=1;
		fibo[2]=2;

		for(int i=3;i<=input;i++){
			fibo[i]=(fibo[i-1]+fibo[i-2])%10007;
		}
		
		System.out.println(fibo[input]);
		
	}

}