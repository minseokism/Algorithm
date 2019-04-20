/*
	[2581 문제] 소수

	문제 - 자연수 M과 N이 주어질 때 M이상 N이하의 자연수 중 소수인 것을 모두 골라 이들 소수의 합과 최소값을 찾는 프로그램을 작성하시오.
	예를 들어 M=60, N=100이 경우 60이상 100이하의 자연수 중 소수는 61, 67, 71, 73, 79, 83, 89, 97 총 8개가 있으므로,
	이들 소수의 합은 620이고, 최소값은 61이 된다.

	입력 - 입력의 첫째 줄에 M이, 둘째 줄에 N이 주어진다.
	M과 N은 10,000이하의 자연수이며, M은 N보다 같거나 작다.

	출력 - M이상 N이하의 자연수 중 소수인 것을 모두 찾아 첫째 줄에 그 합을, 둘째 줄에 그 중 최소값을 출력한다.
	단, M이상 N이하의 자연수 중 소수가 없을 경우는 첫째 줄에 -1을 출력한다.

	예제 입력 -
	60
	100

	예제 출력 -
	620
	61
*/

package baekjoonJudge.Num2000;

import java.util.ArrayList;
import java.util.Scanner;

public class Num2581 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();

		ArrayList<Boolean> primeList = new ArrayList<Boolean>(end+1);

		primeList.add(false);
		primeList.add(false);

		for(int i=2; i<=10000; i++ )
			primeList.add(i, true);

		for(int i=2; (i*i)<=10000; i++){
			if(primeList.get(i)){
				for(int j = i*i; j<=10000; j+=i) primeList.set(j, false);
			}
		}

		boolean first = true;
		int min = 0;
		int sum = 0;

		for(int i=start; i<=end; i++){
			if(primeList.get(i) == true) {
				sum += i;

				if (first) {
					min = i;
					first = false;
				}
			}
		}

		if (first) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(min);
		}
	}
}
