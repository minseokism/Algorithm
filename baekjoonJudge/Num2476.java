/*
	[2476 문제] 주사위 게임

	문제 - 1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게임이 있다.

			1. 같은 눈이 3개가 나오면 10,000원+(같은 눈)*1,000원의 상금을 받게 된다.
			2. 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)*100원의 상금을 받게 된다.
			3. 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)*100원의 상금을 받게 된다.

			예를 들어, 3개의 눈 3, 3, 6이 주어지면 상금은 1,000+3*100으로 계산되어 1,300원을 받게 된다.
			또 3개의 눈이 2, 2, 2로 주어지면 10,000+2*1,000 으로 계산되어 12,000원을 받게 된다.
			 3개의 눈이 6, 2, 5로 주어지면 그 중 가장 큰 값이 6이므로 6*100으로 계산되어 600원을 상금으로 받게 된다.
			N (2≤N≤1,000) 명이 주사위 게임에 참여하였을 때, 가장 많은 상금을 받은 사람의 상금을 출력하는 프로그램을 작성하시오.
	입력 - 첫째 줄에는 참여하는 사람 수 N이 주어지고 그 다음 줄부터 N개의 줄에 사람들이
			주사위를 던진 3개의 눈이 빈칸을 사이에 두고 각각 주어진다.
	출력 - 첫째 줄에 가장 많은 상금을 받은 사람의 상금을 출력한다.
	예제 입력 -	3
				3 3 6
				2 2 2
				6 2 5
	예제 출력 -	12000
*/

package baekjoonJudge;

import java.util.Arrays;
import java.util.Scanner;

public class Num2476 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		int size = sc.nextInt();
		int max = 0;
		int temp ;

		for	(int i = 0 ; i < size ; i++) {
			int[] tempArr = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
			temp = price(tempArr);
			if (max <= temp) max = temp;
		}

		System.out.println(max);
	}

	static int price(int[] tempArr) {
		Arrays.sort(tempArr);
		int overlap = 1;
		int number = 0;
		int output ;

		for	(int i = 0 ; i < 2 ; i++) {
			for	(int j = i+1 ; j < 3 ; j++) {
				if (tempArr[i] == tempArr[j]) {
					number = tempArr[i];
					overlap ++;
				}
			}
			if (overlap == 3) break;
		}

		if (overlap == 3) output = 10000 + number*1000;
		else if (overlap == 2) output = 1000 + number*100;
		else output = tempArr[2] * 100;

		return output;
	}

}
