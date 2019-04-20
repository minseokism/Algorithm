/*
	[1085 문제] 직사각형에서 탈출
	문제 - 한수는 지금 (x, y)에 있다. 직사각형의 왼쪽 아래 꼭지점은 (0, 0)에 있고, 오른쪽 위 꼭지점은 (w, h)에 있다. 
		  직사각형의 경계선까지 가는 거리의 최솟값을 구하는 프로그램을 작성하시오.	
	입력 - 첫째 줄에 x y w h가 주어진다. w와 h는 1,000보다 작거나 같은 자연수이고, x는 1보다 크거나 같고, w-1보다 작거나 같은 자연수이고, 
		 y는 1보다 크거나 같고, h-1보다 작거나 같은 자연수이다.
	출력 - 첫째 줄에 문제의 정답을 출력한다.
	예제 입력  - 6 2 10 3
	예제 출력  - 1
*/


package baekjoonJudge.num1000;

import java.util.Arrays;
import java.util.Scanner;

public class Num1085 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[4];
		int[] min = new int[4];
		for(int i=0 ; i<4 ; i++) {
			arr[i] = sc.nextInt();
		}
		
		min[0] = arr[2]-arr[0];
		min[1] = arr[3]-arr[1];
		min[2] = arr[0];
		min[3] = arr[1];
		
		Arrays.sort(min);
		
		System.out.println(min[0]);
		sc.close();
	}

}
