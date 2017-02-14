/*
	[11724 문제] 연결 요소의 개수
	방향 없는 그래프가 주어졌을 때, 연결 요소 (Connected Component)의 개수를 구하는 프로그램을 작성하시오.

	입력 - 첫째 줄에 정점의 개수 N과 간선의 개수 M이 주어진다. (1 ≤ N ≤ 1,000, 1 ≤ M ≤ N×(N-1)/2)
	둘째 줄부터 M개의 줄에 간선의 양 끝점 u와 v가 주어진다. (1 ≤ u, v ≤ N, u ≠ v) 같은 간선은 한 번만 주어진다.

	출력 - 첫째 줄에 연결 요소의 개수를 출력한다.

	예제 입력 1 -
	6 5
	1 2
	2 5
	5 1
	3 4
	4 6

	예제 출력 1 -
	2

	예제 입력 2 -
	6 8
	1 2
	2 5
	5 1
	3 4
	4 6
	5 4
	2 4
	2 3

	예제 출력 2 -
	1
*/

package baekjoonJudge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Num11724 {
	static List<Integer>[] ls;
	static boolean[] check;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		ls = new ArrayList[n+1];
		check = new boolean[n+1];

		for (int i = 0 ; i <= n ; i++) {
			ls[i] = new ArrayList();
		}

		for (int i = 0; i < m; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();

			ls[u].add(v);
			ls[v].add(u);
		}

		int components = 0;

		for (int i = 1; i <= n; i++) {
			if (check[i] == false) {
				dfs(i);
				components += 1;
			}
		}
		System.out.println(components);
	}

	static void dfs(int node) {
		check[node] = true;
		for (int i = 0; i < ls[node].size(); i++) {
			int next = ls[node].get(i);
			if (check[next] == false) {
				dfs(next);
			}
		}
	}
}
