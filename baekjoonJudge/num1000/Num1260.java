/*
	[1260 문제] DFS와 BFS
	문제 - 그래프를 DFS로 탐색한 결과와 BFS로 탐색한 결과를 출력하는 프로그램을 작성하시오.
	단, 방문할 수 있는 정점이 여러 개인 경우에는 정점 번호가 작은 것을 먼저 방문하고,
	더 이상 방문할 수 있는 점이 없는 경우 종료한다.

	입력 - 첫째 줄에 정점의 개수 N(1≤N≤1,000), 간선의 개수 M(1≤M≤10,000), 탐색을 시작할 정점의 번호 V가 주어진다.
	다음 M개의 줄에는 간선이 연결하는 두 정점의 번호가 주어진다. 한 간선이 여러 번 주어질 수도 있는데,
	간선이 하나만 있는 것으로 생각하면 된다. 입력으로 주어지는 간선은 양방향이다.

	출력 - 첫째 줄에 DFS를 수행한 결과를, 그 다음 줄에는 BFS를 수행한 결과를 출력한다. V부터 방문된 점을 순서대로 출력하면 된다.

	예제 입력 -
	4 5 1
	1 2
	1 3
	1 4
	2 4
	3 4

	예제 출력 -
	1 2 4 3
	1 2 3 4
*/

package baekjoonJudge.num1000;

import java.util.*;

public class Num1260 {
	static List<Integer>[] adjacencyList;
	static boolean[] check;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberOfVertex = sc.nextInt();
		int numberOfEdge = sc.nextInt();
		int start = sc.nextInt();

		adjacencyList = new ArrayList[numberOfVertex+1];

		for (int i = 0 ; i <= numberOfVertex ; i++) {
			adjacencyList[i] = new ArrayList<>();
		}

		for (int i = 0 ; i < numberOfEdge ; i++) {
			int v = sc.nextInt();
			int e = sc.nextInt();

			adjacencyList[v].add(e);
			adjacencyList[e].add(v);
		}

		for (int i = 0 ; i <= numberOfVertex ; i++) {
			Collections.sort(adjacencyList[i]);
		}

		check = new boolean[numberOfVertex+1];
		dfs(start);
		System.out.println();

		check = new boolean[numberOfVertex+1];
		bfs(start);
		System.out.println();

	}

	static void dfs(int number) {
		if (check[number]) return;

		check[number] = true;
		System.out.print(number + " ");

		for(int i : adjacencyList[number]) {
			if(!check[i]) dfs(i);
		}
	}

	static void bfs(int number) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(number);
		check[number] = true;

		while (!queue.isEmpty()) {
			int x = queue.remove();
			System.out.print(x + " ");

			for (int i : adjacencyList[x]) {
				if (!check[i]) {
					check[i] = true;
					queue.add(i);
				}
			}
		}
	}
}
