package codingtest.company2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FriendBook {
	private String filePath;
	private Map<String, Set<String>> friendMap;
	
	public FriendBook(String fileName) {
		filePath = findPath(fileName);
		roadText();
	}
	
	public String finder(String input) {
		StringBuilder output = new StringBuilder();
		
		if(friendMap.containsKey(input)) {
			Set<String> myFriends = findFriends(input);
			output.append(setToString(myFriends)).append("\n");			
			
			Set<String> potentialFriends = findPotentialFriends(myFriends);
			myFriends.add(input);
			
			potentialFriends.removeAll(myFriends);
			output.append(setToString(potentialFriends));		
			return output.toString();
		}
		
		return "친구가 없습니다.";
	}

	private HashSet<String> findPotentialFriends(Set<String> myFriends) {
		Set<String> friends = new HashSet<>();
		Set<String> potentialFriends;
		
		for (String myFriendName : myFriends) {
			potentialFriends = findFriends(myFriendName);
			Collections.addAll(friends, potentialFriends.toArray(new String[potentialFriends.size()]));
		}
		
		return (HashSet<String>) friends;
	}

	private HashSet<String> findFriends(String input) {
		return (HashSet<String>) friendMap.get(input);
	}

	public void roadText() {
		friendMap = new HashMap<>();		
		String textLine;

		try{
			BufferedReader br = new BufferedReader(new FileReader(filePath));
			boolean firstLine = true;
			
			while ((textLine = br.readLine()) != null) {				
				if(firstLine) {
					textLine = checkBOM(textLine);
					firstLine = false;
				}				
				
				putFriends(textLine.split(" "));
						
			}
			
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void putFriends(String[] arr) {
		Set<String> friendSet;
	
		for (int i = 0 ; i < 2 ; i++) {
			String temp = (i == 0 ? arr[1] : arr[0]);
			
			if (!friendMap.containsKey(arr[i])) {
				friendSet = new HashSet<>();
				friendSet.add(temp);
				friendMap.put(arr[i], friendSet);	
			} else {
				friendMap.get(arr[i]).add(temp);
			}
			
		}
	}
	
	private String checkBOM(String text) {	
		int bom = text.charAt(0)+0;
		if(bom == 65297) {
			text = text.substring(0);
		}
		return text;
	}
	
	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	
	private String findPath(String fileName) {
		return FriendBook.class.getResource(fileName).getPath();
	}
	
	private String setToString(Set<String> set) {
		return set.toString().replace("[", "").replace("]", "").replace(",", "");
	}

}
