//11726-재귀함수, 피보나치 사용해서 풀이
//5개입력
//재귀함수


package baekjoonJudge.dynamicprg;

import java.util.Arrays;
import java.util.Scanner;
 
public class Num11726_2{
    private static int[] numbers = new int[1001];
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Arrays.fill(numbers, 0);
        numbers[1] = 1;
        numbers[2] = 2;
       
        for(int i=0;i<5;i++){
          int n = Integer.parseInt(in.nextLine());
          System.out.println(fibo(n));          
        }
        in.close();
    }

    public static int fibo(int n){
        if(numbers[n] != 0){
            return numbers[n];
        }

        numbers[n] = (fibo(n-1) + fibo(n-2))%10007;
        return numbers[n];
    }
} 
