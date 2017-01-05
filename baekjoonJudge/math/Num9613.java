/*
	[9613 문제] GCD의 합
	문제 - 양의 정수 n개가 주어졌을 때, 가능한 모든 쌍의 GCD의 합을 구하는 프로그램을 작성하시오.
	입력 - 첫째 줄에 테스트 케이스의 개수 t (1 < t < 100)이 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, 
		  첫째 줄에는 수의 개수 n (1 < n < 100)가 주어지고, 다음에는 n개의 수가 주어진다. 
		  입력으로 주어지는 수는 1000000을 넘지 않는다.
	출력 - 각 테스트 케이스마다 가능한 모든 쌍의 GCD의 합을 출력한다.
	예제 입력  - 3
			 4 10 20 30 40
			 3 7 5 12
			 3 125 15 25
	예제 출력  - 70
			 3
			 35
*/

package baekjoonJudge.math;

import java.util.Scanner;

public class Num9613 {
	static Scanner sc;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testNum = sc.nextInt();
		int inputNum ;
		for(int i=0 ; i<testNum ; i++){
			inputNum=sc.nextInt();
			int[] arr=new int[inputNum];
			for(int j=0; j<inputNum ; j++){
				arr[j]=sc.nextInt();
			}
			solve(arr);
		}
		sc.close();

	}
	public static void solve(int[] arr){
		int length=arr.length;
		int sum=0;
		for (int i = 0; i < length-1; i++) {
            for (int j = i+1; j < length; j++) {
                sum += gcd(arr[i], arr[j]);
            }
        }
		System.out.println(sum);
	}
		
	public static int gcd(int num1, int num2){
		if(num1%num2==0){
			return num2;
		}else{
			return gcd(num2,num1%num2);
		}
	}
}