/*
	[10800 문제] 컬러볼
	문제 - 지훈이가 최근에 즐기는 컴퓨터 게임이 있다. 이 게임은 여러 플레이어가 참여하며,
	각 플레이어는 특정한 색과 크기를 가진 자기 공 하나를 조정하여 게임에 참여한다.
	각 플레이어의 목표는 자기 공보다 크기가 작고 색이 다른 공을 사로잡아 그 공의 크기만큼의 점수를 얻는 것이다.
	그리고 다른 공을 사로잡은 이후에도 본인의 공의 색과 크기는 변하지 않는다. 다음 예제는 네 개의 공이있다. 편의상 색은 숫자로 표현한다.
		    
	공 번호	색	크기
	1		1	10
	2		3	15
	3		1	3
	4		4	8

	이 경우, 2번 공은 다른 모든 공을 사로잡을 수 있다. 반면, 1번 공은 크기가 더 큰 2번 공과 색이 같은 3번 공은 잡을 수 없으며,
	단지 4번 공만 잡을 수 있다. 공들의 색과 크기가 주어졌을 때, 각 플레이어가 사로잡을 수 있는 모든 공들의
	크기의 합을 출력하는 프로그램을 작성하시오.

	입력 - 첫 줄에는 공의 개수를 나타내는 자연수 N이 주어진다(1 ≤ N ≤ 200,000).
	다음 N개의 줄 중 i번째 줄에는 i번째 공의 색을 나타내는 자연수 Ci와 그 크기를 나타내는 자연수 Si가 주어진다
	(1 ≤ Ci ≤ N, 1 ≤ Si ≤ 2,000). 서로 같은 크기 혹은 같은 색의 공들이 있을 수 있다.

	출력 - N개의 줄을 출력한다. N개의 줄 중 i번째 줄에는 i번째 공을 가진 플레이어가 잡을 수 있는 모든 공들의 크기 합을 출력한다.

	예제 입력 1 -
	4
	1 10
	3 15
	1 3
	4 8

	예제 출력 1 -
	8
	21
	0
	3

	예제 입력 2 -
	3
	2 3
	2 5
	2 4

	예제 출력 2 -
	0
	0
	  0
*/

package baekjoonJudge.Num10000;

import java.util.Scanner;

public class Num10800 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberOfPlayer = sc.nextInt();
		int[][] player = new int[numberOfPlayer][3];

		for (int i = 0 ; i < numberOfPlayer ; i++) {
			player[i][0] = sc.nextInt();
			player[i][1] = sc.nextInt();
		}

		for (int i = 0 ; i < numberOfPlayer ; i++) {
			for (int j = i+1 ; j < numberOfPlayer ; j++) {
			  	if (player[i][0] != player[j][0]) {
					if( player[i][1] > player[j][1] ) {
						player[i][2] += player[j][1];
					} else {
						player[j][2] += player[i][1];
					}
				}
			}
		}

		for (int i = 0 ; i < numberOfPlayer ; i++) {
			System.out.println(player[i][2]);
		}

		sc.close();
	}

}