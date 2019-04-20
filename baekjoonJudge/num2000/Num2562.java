/*
	[2562 문제] 최대값
	문제 - 9개의 서로 다른 자연수가 주어질 때, 이들 중 최대값을 찾고 그 최대값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
          예를 들어, 서로 다른 9개의 자연수

          3, 29, 38, 12, 57, 74, 40, 85, 61

          이 주어지면, 이들 중 최대값은 85이고, 이 값은 8번째 수이다.
	입력 - 첫 째 줄부터 아홉 번째 줄까지 한 줄에 하나의 자연수가 주어진다. 주어지는 자연수는 100 보다 작다.
	출력 - 첫째 줄에 최대값을 출력하고, 둘째 줄에 최대값이 몇 번째 수인지를 출력한다.
	예제 입력  - 3
                29
                38
                12
                57
                74
                40
                85
                61
	예제 출력  - 85 8
*/


package baekjoonJudge.Num2000;

import java.util.Scanner;

/**
 * Created by minseokism on 2016-11-23.
 */
public class Num2562 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int big = 0;
        int num = 0;
        int temp = 0;

        for(int i = 1 ; i < 10 ; i++){
            temp = sc.nextInt();

            if( big < temp ) {
                num = i;
                big = temp;
            }
        }

        System.out.println(big+" "+num);
    }

}
