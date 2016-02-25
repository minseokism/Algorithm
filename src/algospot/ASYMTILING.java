//1, 2, 3, 4, 5, 6, 7, 8 

//1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597
//0, 0, 2, 3, 6,   , 18
 
//홀수
//1           1            2         3         5    13
//짝수
//   2(1x1+1)     3(1x2+1)  5(2x2+1)  7(3x2+1)  
package algospot;

import java.util.Arrays;
import java.util.Scanner;

public class ASYMTILING {
	private static int[] numbers = new int[101];
	 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = Integer.parseInt(sc.nextLine());
		Arrays.fill(numbers, 0);
		for(int i=0;i<input;i++){
			
			int num = Integer.parseInt(sc.nextLine());
			System.out.println(num);
			
		}
		sc.close();
	}
	
    public static int fibo(int n){
        if(numbers[n] != 0){
            return numbers[n];
        }

        numbers[n] = (fibo(n-1) + fibo(n-2))%10007;
        return numbers[n];
    }

}
