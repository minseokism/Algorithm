/*
 	[문제] 아래의 기능을 수행하는 프로그램을 작성하세요.
	입력 : 사용자 이름 (콘솔 등으로 직접 입력받습니다)
	입력 받은 사용자 이름이 목록에 없는 경우 에러 메시지를 출력하고 끝냅니다.
	출력 :
	내 친구 목록
	내 친구의 친구 목록
	계산을 위한 전체 친구 목록은 위에서 링크로 제공된 텍스트 파일을 읽어들여 이용하세요.
	프로그래밍 언어에 제약은 없지만, 외부 라이브러리는 사용하지 마세요.
*/

package codingtest.company2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		FriendBook fb = new FriendBook("sns-friends.txt");
		Scanner sc = new Scanner(System.in);
		
		System.out.println(fb.finder(sc.next()));;
		sc.close();
	}
}
