/*
	[2178 문제] 미로 탐색
	N×M크기의 배열로 표현되는 미로가 있다.

	1	0	1	1	1	1
	1	0	1	0	1	0
	1	0	1	0	1	1
	1	1	1	0	1	1

	미로에서 1은 이동할 수 있는 칸을 나타내고, 0은 이동할 수 없는 칸을 나타낸다.
	이러한 미로가 주어졌을 때, (1, 1)에서 출발하여 (N, M)의 위치로 이동할 때 지나야 하는 최소의 칸 수를 구하는 프로그램을 작성하시오.
	위의 예에서는 15칸을 지나야 (N, M)의 위치로 이동할 수 있다. 칸을 셀 때에는 시작 위치와 도착 위치도 포함한다.

	입력 - 첫째 줄에 두 정수 N, M(2≤N, M≤100)이 주어진다.
	다음 N개의 줄에는 M개의 정수로 미로가 주어진다. 각각의 수들은 붙어서 입력으로 주어진다.

	출력 - 첫째 줄에 지나야 하는 최소의 칸 수를 출력한다. 항상 도착위치로 이동할 수 있는 경우만 입력으로 주어진다.

	예제 입력 1 -
	4 6
	101111
	101010
	101011
	111011

	예제 출력 1 -
	15

	예제 입력 2 -
	4 6
	110110
	110110
	111111
	111101

	예제 출력 2 -
	9
*/

package baekjoonJudge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Num2178 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int[][] maze = new int[n][m];

		String row;

		for (int i = 0 ; i < n ; i++) {
			row = br.readLine();

			for (int j = 0 ; j < m ; j++) {
				maze[i][j] = Integer.parseInt(String.valueOf(row.charAt(j)));
			}
		}

		int min = n*m;

		Queue<Vertex> Q = new LinkedList<>();
		Q.add(new Vertex(0,0,1));
		Vertex curVertex;

		while (!Q.isEmpty()) {
			curVertex = Q.poll();

			maze[curVertex.x][curVertex.y] = 0;

			if (curVertex.x == n-1 && curVertex.y == m-1) {
				if (min > curVertex.length) min = curVertex.length;
			}

			//왼쪽
			if (curVertex.y-1 > -1 && maze[curVertex.x][curVertex.y-1] == 1) {
				Q.add(new Vertex(curVertex.x,curVertex.y-1,curVertex.length+1));
			}

			//오른쪽
			if (curVertex.y+1 < m && maze[curVertex.x][curVertex.y+1] == 1) {
				Q.add(new Vertex(curVertex.x,curVertex.y+1,curVertex.length+1));

			}

			//위쪽
			if (curVertex.x-1 > -1  && maze[curVertex.x-1][curVertex.y] == 1) {
				Q.add(new Vertex(curVertex.x-1, curVertex.y, curVertex.length+1));
			}

			//아래쪽
			if (curVertex.x+1 < n  && maze[curVertex.x+1][curVertex.y] == 1) {
				Q.add(new Vertex(curVertex.x+1, curVertex.y, curVertex.length+1));
			}

		}

		System.out.println(min);
	}
}

class Vertex {
	int x , y, length;

	public Vertex(int x, int y, int length) {
		this.x = x;
		this.y = y;
		this.length = length;
	}
}