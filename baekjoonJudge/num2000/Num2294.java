/*
	[2294 문제] 동전 2
	n가지 종류의 동전이 있다. 각각의 동전이 나타내는 가치는 다르다. 이 동전들을 적당히 사용해서,
	그 가치의 합이 k원이 되도록 하고 싶다. 그러면서 동전의 개수가 최소가 되도록 하려고 한다.
	(각각의 동전은 몇개라도 사용할 수 있다.)

	입력 - 첫째줄에 n, k가 주어진다. (1 ≤ n ≤ 100, 1 ≤ k ≤ 10,000) 다음 n개의 줄에는 각각의 동전의 가치가 주어진다.

	출력 - 첫째줄에 사용한 동전의 최소 개수를 출력한다. 불가능한 경우에는 -1을 출력한다.

	예제 입력 -
	3 15
	1
	5
	12

	예제 출력 -
	3
*/

package baekjoonJudge.Num2000;

import java.util.Arrays;
import java.util.Scanner;

public class Num2294 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberOfCoins = sc.nextInt();
		int total = sc.nextInt();
		int[] coinType = new int[numberOfCoins];

		for (int i = 0 ; i < numberOfCoins ; i++) {
			coinType[i] = sc.nextInt();
		}

		Arrays.sort(coinType);

		int min = 0 ;
		int tempMin = 0 ;
		int tempDiv ;
		int tempTotal;

		for (int i = numberOfCoins ; i > 0 ; i--) {
			tempMin = total / coinType[i];
			tempTotal = total - tempMin * coinType[i];
			for (int j = numberOfCoins - 1 ; j >= 0 ; j--) {
				if (tempTotal != 0) {
					tempDiv = tempTotal / coinType[j];
					tempTotal -= tempDiv * coinType[j];
				}
			}
		}
	}
}
