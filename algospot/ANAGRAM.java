/*
	[ANAGRAM]
	문제 출처 : https://algospot.com/judge/problem/read/ANAGRAM
*/

package algospot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ANAGRAM {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		String str;
		for (int i = 0 ; i < num ; i++) {
			str = br.readLine();
			System.out.println(anagram(str));
		}
		
	}
	
	static String anagram(String input) {
		String[] arr = input.split(" ");
		if(arr[0].equals(arr[1])) return "No.";
		String ori, ana;
		ori = toCharArr(arr[0]);
		ana = toCharArr(arr[1]);
		if(ori.equals(ana)) return "Yes";
		return "No.";
	}

	 static String toCharArr(String s) {
		char[] arr = s.toCharArray();
		StringBuilder sb = new StringBuilder();
		Arrays.sort(arr);
		for (char c : arr) {
			sb.append(c);
		}
		return sb.toString();
	}
	

}
