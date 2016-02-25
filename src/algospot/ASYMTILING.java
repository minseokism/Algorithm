//1, 2, 3, 4, 5, 6, 7, 8 

//1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597
//0, 0, 2, 3, 6,   , 18
 
//홀수
//1           1            2         3         5    13
//짝수
//   2(1x1+1)     3(1x2+1)  5(2x2+1)  7(3x2+1)  
package algospot;

import java.util.Scanner;

public class ASYMTILING {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int inputArray[]=new int[50];
		for(int i=0 ; i<input ; i++){
			inputArray[i]=sc.nextInt();
		}
		sc.close();
		
		int[] fibo=new int[101];
		fibo[0]=0;
		fibo[1]=1;

		for(int i=2;i<=input;i++){
			fibo[i]=fibo[i-1]+fibo[i-2];
		}
		
		if(input%2==0){
			
		}else{
			
		}
		
	}

}
