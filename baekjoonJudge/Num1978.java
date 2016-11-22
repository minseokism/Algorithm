/*
	[1978 문제] 소수 찾기
	문제 - 주어진 숫자들 중 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.
	입력 - 첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.
	출력 - 주어진 수들 중 소수의 개수를 출력한다.
	예제 입력  - 4
				1 3 5 7
	예제 출력  - 3
*/

package baekjoonJudge;

import java.util.Scanner;

public class Num1978 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int num;
        int cnt = 0;
		for(int i=0 ; i<input ; i++) {
			num = sc.nextInt();
			if(findPrimeNum(num)) cnt++;
		}
		System.out.println(cnt);
		sc.close();
	}

    private static boolean findPrimeNum(int num) {
        boolean judge = true;
        if (num > 1) {
            for (int i = 2; i < num; i++) {
                System.out.println("hi");
                if (num % i == 0) judge = false;
            }
        } else judge = false;

        return judge;
    }
}


