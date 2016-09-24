/*
 	Q3. 원형테이블에서 하는 게임의 승리자가 되기 위해 앉아야할 좌석번호르 출력하는 함수를 작성해주세요.
 	
 	게임의 규칙의 다음과 같습니다 :
 	1. 원형테이블에 n명의 사람이 앉아있습니다. 시계방향으로 각각 1에서부터 n까지의 좌석번호가 부여됩니다.
  	2. 첫번째 사람으로부터 시계방향으로 m번째 사람을 탈락시킵니다.
  	3. 탈락한 사람으로부터 시계방향으로 m번째 사람을 탈락시킵니다.
 	4. 최종적으로 한명이 남을때까지 3을 반복합니다.
 	5. 최종적으로 남은 한명이 승리자가 됩니다.
 		  
 	입력인자 :
 	Name		Type		Description
 	n			integer		게임에 참가하는 인원수
 	m			integer		몇명째를 탈락시킬지 나타내는 숫자
 	
	반환값 : 승리자가 되기 위한 좌석번호
	
	예시 1 : n이 3이고, m이 2일때
	- 진행
		1, 2, 3 		-> 시작
		1, 2 			-> 3 탈락
		1				-> 2 탈락, 1이 최종 우승자
	- 실행 예시
	play(3,2)
	> 1	
	
	예시 2 : n이 5이고, m이 3일때
	- 진행
		1, 2, 3, 4, 5 	-> 시작
		1, 2, 3, 5		-> 4 탈락
		1, 3, 5 		-> 2 탈락
		3, 5			-> 1 탈락
		5				-> 3 탈락, 5가 최종 우승자
	- 실행 예시
	play(5,3)
	> 5

*/
package codingtest.company1;

import java.util.LinkedList;
import java.util.List;

public class Q3 {

	public static void main(String[] args) {
		play(3, 2);
		play(5, 3);
	}
	
	public static void play(int n, int m) {
		
		int start = 0;
		int drop = 0;
		int size = n;
		List<Integer> list = new LinkedList<Integer>();
		
		for (int i = 1; i <= n; i++) list.add(i);
		
		while (size > 1) {
			drop = (start + m) % size;
			list.remove(drop);
			start = drop - 1;
			size--;
		}
		
		System.out.println(list.get(0));
	}
}