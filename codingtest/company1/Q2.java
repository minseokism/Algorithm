/*
 	Q2. 문자열내 등장하는 문자의 빈도수를 검사하는 함수를 작성해주새요.
 	
	빈도수 값 : 
	- 등장하는 문자와 등장하는 빈도수를 concatenate합니다.
 	- 빈도수가 높은 문자일수록 앞쪽에 와야 합니다.
 	- 빈도수가 같다면 등장한 순서대로 정렬합니다.
 		  
 	입력인자 :
 	Name		Type		Description
 	s			string		빈도수를 검사할 문자열
 	
	반환값 : 빈도수 값

	예시 :
	freq('abc')
	> a1b1c1
	freq('abbc')
	> b2a1c1
	freq('Hello, World!')
	> 13o2H1e1.1 1W1r1d1!1
*/

package codingtest.company1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Q2 {

	public static void main(String[] args) {
		freq("abc");				// a1b1c1
		freq("abbc");				// b2a1c1
		freq("Hello, World!");		// l3o2H1e1,1 1W1r1d1!1
	}

	private static void freq(String s) {
		
		String result = "";
		int count = 0;
		Set<String> set = new LinkedHashSet<String>();
		
		// 문자 + 빈도수 형태로 list에 저장	exam) a1, b2
		for (int i = 0; i < s.length(); i++) {			
			count = 0;			
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) == s.charAt(i)) {
					count++;
				}
			}			
			set.add(s.charAt(i) + "" + count);
		}
		
		// set을 list화 시킨 후 빈도수가 높은순으로 정렬
		List<String> list = new ArrayList<String>(set);		
		Collections.sort(list, new Comparator<String>(){
			
			public int compare(String s1, String s2) {
				int count1 = Integer.parseInt(s1.substring(1));
				int count2 = Integer.parseInt(s2.substring(1));
				return count1 > count2 ? -1 : count1 < count2 ? 1 : 0;
			}
			
		});
		
		//출력
		for(String i : list) {
			result += i;
		}
		
		System.out.println(result);
	}
}
