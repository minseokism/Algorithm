/*
	[1920 문제] 수 찾기
	문제 - N개의 정수 A[1], A[2], …, A[N]이 주어져 있을 때, 이 안에 X라는 정수가 존재하는지 알아내는 프로그램을 작성하시오.
	입력 - 첫째 줄에 자연수 N(1≤N≤100,000)이 주어진다. 다음 줄에는 N개의 정수 A[1], A[2], …, A[N]이 주어진다.
		  다음 줄에는 M(1≤M≤100,000)이 주어진다. 다음 줄에는 M개의 수들이 주어지는데, 이 수들이 A안에 존재하는지 알아내면 된다.
		  모든 정수들의 범위는 int 로 한다.
	출력 - M개의 줄에 답을 출력한다. 존재하면 1을, 존재하지 않으면 0을 출력한다.
	예제 입력  - 5
				4 1 5 2 3
				5
				1 3 7 9 5
	예제 출력  - 1
				1
				0
				0
				1
*/
package baekjoonJudge.num1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Num1920 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		Set<Integer> hs = new HashSet<>();
		String[] stringArr = br.readLine().split(" ");

		for(int i = 0 ; i < size ; i++) {
			hs.add(Integer.parseInt(stringArr[i]));
		}

		size = Integer.parseInt(br.readLine());
		String[] stringArr2 = br.readLine().split(" ");
		StringBuilder sb = new StringBuilder();

		for(int i = 0 ; i < size ; i ++) {
			if(hs.contains(Integer.parseInt(stringArr2[i]))) {
				sb.append(1+" ");
			} else {
				sb.append(0+" ");
			}
		}
		sb.deleteCharAt(size*2-1);
		System.out.println(sb);
	}
}
