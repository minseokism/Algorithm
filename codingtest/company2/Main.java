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

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
	private static HashMap<String, Set<String>> friendDB = new HashMap<>();
	private static Set<String> potentialFriends =  new HashSet<>();

	public static void main(String[] args) {
		FriendBook fb = new FriendBook();
		fb.roadTextFile(friendDB);

		Scanner sc = new Scanner(System.in);
		String myName = sc.nextLine();

		if(friendDB.containsKey(myName)) {
			fb.setToString(friendDB.get(myName));
			String[] friendArr = fb.findFriend(friendDB, myName);

			Set<String> removeSet = new HashSet<>();
			removeSet.add(myName);

			for (String friend : friendArr) {
				Collections.addAll(potentialFriends, fb.findFriend(friendDB, friend));
				removeSet.add(friend);
			}
			potentialFriends.removeAll(removeSet);
			fb.setToString(potentialFriends);

		} else {
			System.out.println("목록에 존재하지 않는 이름입니다.");
			System.exit(1);
		}
	}


}

class FriendBook {
	 void roadTextFile(Map<String, Set<String>> friendMap) {
		try {
			String path = FriendBook.class.getResource("").getPath();
			BufferedReader br = new BufferedReader(new FileReader(path+"sns-friends.txt"));
			String textLine;
			boolean firstLine = true;

			while((textLine = br.readLine()) != null) {
				if(firstLine) {
					textLine = textLine.substring(1);
					firstLine = false;
				}

				String[] arr = textLine.split(" ");
				Set<String> keySet;

				for(int i = 0 ; i < 2 ; i++) {
					keySet = new HashSet<>();
					String tempValue = (i==0 ? arr[1]:arr[0]);

					if(!friendMap.containsKey(arr[i])) {
						keySet.add(tempValue);
						friendMap.put(arr[i],keySet);
					} else {
						friendMap.get(arr[i]).add(tempValue);
					}
				}
			}
		} catch(IOException e) {
			System.out.println(e);
			System.exit(1);
		}
	}

	String[] findFriend(Map<String, Set<String>>friendDB, String name) {
		Set<String> friendSet = friendDB.get(name);
		int size = friendSet.size();
		return friendSet.toArray(new String[size]);
	}

	void setToString(Set<String> friendSet) {
		String myFriend = friendSet.toString();
		System.out.println(myFriend.replace("[","").replace(",","").replace("]",""));
	}

}