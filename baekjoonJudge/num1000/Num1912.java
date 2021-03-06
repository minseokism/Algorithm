/*
	[1912 문제] 연속합
	문제 - n개의 정수로 이루어진 임의의 수열이 주어진다. 우리는 이 중 연속된 몇 개의 숫자를 선택해서 구할 수 있는 합 중 가장 큰 합을 구하려고 한다. 
		  단, 숫자는 한 개 이상 선택해야 한다.
		  예를 들어서 10, -4, 3, 1, 5, 6, -35, 12, 21, -1 이라는 수열이 주어졌다고 하자. 
		  여기서 정답은 12+21인 33이 정답이 된다.
	입력 - 첫째 줄에 정수 n(1≤n≤100,000)이 주어지고 둘째 줄에는 n개의 정수로 이루어진 수열이 주어진다.
	출력 - 첫째 줄에 답을 출력한다.
	예제 입력 1 - 10
				10 -4 3 1 5 6 -35 12 21 -1
	예제 출력 1 - 33
*/

package baekjoonJudge.num1000;

import java.util.Scanner;

public class Num1912 {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int input = sc.nextInt();
		int[] arr = new int[input];

		for(int i = 0 ; i < input ; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(go(arr));
		sc.close();
		
	}
	
	public static int go(int[] arr) {
		int max=arr[0];
		for(int i=0 ; i<arr.length ; i++) {
			int temp=arr[i];
			int temp2=arr[i];
			for(int j=i+1 ; j<arr.length ; j++) {
				temp2+=arr[j];
				if(temp<temp2) {
					temp=temp2;
				}
			}
			if(max < temp) {
				max = temp;
			}
		}		
		return max;
	}
}
