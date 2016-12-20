package codingtest.company3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

class Finder {
	private List<String> nameList;

	void find() {
		String names = "이유덕,이재영,권종표,이재영,박민호,강상희,이재영,김지완,최승혁,이성연,박영서,박민호,전경헌,송정환,김재성,이유덕,전경헌";
		nameList = stringToList(names);
		StringBuffer output = new StringBuffer();
		
		output.append("1. 김씨와 이씨는 각각 몇 명 인가요?\n");
		output.append("김씨는").append(findNumberOfFirstName("김")).append("명, ");
		output.append("이씨는 ").append(findNumberOfFirstName("이")).append("명\n");
		
		output.append("2. \"이재영\"이란 이름이 몇 번 반복되나요?\n");
		String findName = "이재영";
		output.append(findName(findName)).append("번\n");
		
		output.append("3. 중복을 제거한 이름을 출력하세요.\n");
		deduplication();
		output.append(nameList.toString()).append("\n");
		
		output.append("4. 중복을 제거한 이름을 오름차순으로 정렬하여 출력하세요.\n");
		Collections.sort(nameList);
		output.append(nameList.toString());
		System.out.println(output);

	}
	
	private List<String> stringToList(String names) {
		List<String> list = new ArrayList<>();
		String[] nameArray = names.split(",");
		Collections.addAll(list, nameArray);

		return list;
	}
	
	private int findNumberOfFirstName(String firstName) {
		int numberOfFirstName = 0;
		for(String name : nameList) {
			if(name.startsWith(firstName)) numberOfFirstName++;
			
		}
		
		return numberOfFirstName;
	}
	
	private int findName(String findName) {
		int numberOfName = 0;
		for(String name : nameList) {
			if(name.contentEquals(findName)) numberOfName++;
		}
		
		return numberOfName;
	}
	
	private void deduplication() {
		nameList = new ArrayList<>(new HashSet<>(nameList));
	}
}
