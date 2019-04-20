/*
	[10160 문제] 암호
	문제 - 새로 바뀐 KOI 웹사이트의 암호는 N개의 영문 알파벳 대문자로 이루어진다. 특별히 암호는 영문 알파벳 중 처음 K개를 사용해서 만든다. 
		  예를 들어, K=5이면, ‘A', 'B', 'C', 'D', 'E'만으로 암호를 만들게 된다. 하지만 문자가 중복되어 나타날 수도 있고 전혀 안 나타날 수도 있다. 
		  최근 연구에 의해서 2가지의 특정 패턴이 암호에 상당히 많이 나타난다는 사실이 알려졌다. 이 특정 패턴은 ABCBC 와 ABABC 이다. 
		  해커들이 이 정보를 이용할 수 있기 때문에 암호를 만들 때 이 두 패턴 중 어떤 것도 암호 안에 나타나는 것을 피하는 것이 안전한 암호를 만드는 방법이 될 수 있다. 
		  따라서 위의 패턴이 나타나지 않는 암호를 안전한 암호라고 부르고, KOI 웹사이트는 사용자들이 안전한 암호만을 사용하도록 결정하였다. 
		  예를 들어, N=6, K=3일 때, 위 패턴을 포함하는 암호들은 다음과 같은 12가지가 있다. 

		 ABCBCA, ABCBCB, ABCBCC, AABCBC,
		 BABCBC, CABCBC, ABABCA, ABABCB,
		 ABABCC, AABABC, BABABC, CABABC 

		  가능한 총 암호의 개수 36 = 729에서 위의 12가지를 제외하면 717가지의 안전한 암호를 만들 수 있다. 
		  암호의 길이 N, 문자의 가지 수 K가 주어질 때, 만들 수 있는 안전한 암호의 총 개수를 구하는 프로그램을 작성하시오. 
	입력 - 첫 줄에는 각각 암호의 길이와 문자의 가지 수를 나타내는 정수 N 과 K가 공백을 사이에 두고 주어진다. 이 두 정수 값의 범위는 5 ≤ N ≤ 1,000,000, 3 ≤ K ≤ 26이다. 
	출력 - 출력은 한 줄로 이루어진다. 안전한 암호의 총 개수를 1,000,000,009으로 나눈 나머지를 출력한다. 
		  계산 과정에서 32비트 정수 변수가 표현할 수 있는 범위를 넘어서 64비트 정수 변수를 사용해야 할 수도 있음에 주의하라.
	예제 입력 - 6 3
	예제 출력 - 717
*/

package baekjoonJudge.Num10000;

import java.util.Scanner;

public class Num10160 {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double size = sc.nextDouble();
		double num = sc.nextDouble();
		double ans ;
		ans = pow(num, size)-(pow(num, size-5)*(size-4)*2);
		if(size >= 7) {
			ans += pow(num, size-7)*(size-6);
		}
		System.out.println(ans % 1000000009);
		sc.close();
	}

	public static double pow(double num , double size) {
		double temp = 1.0;
		for(int i = 0 ; i < size ; i++ ) {
			temp = temp * num;
		}

		return temp;
	}
}
