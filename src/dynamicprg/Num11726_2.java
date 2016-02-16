package dynamicprg;
//11726-재귀함수, 피보나치 사용해서 풀이
//5개입력
//재귀함수

import java.util.Scanner;

public class Num11726_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input[] = new int[5];
		for(int i=0;i<5;i++){
			input[i]=sc.nextInt();
		}
		sc.close();		

		System.out.println(fib(input[0]));
		
	}
	//1 2 3 5 8 
	static int fib(int input){
		return 0;
	}
	
	
}
