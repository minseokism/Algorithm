package codingtest.company5;

/*
[문제 설명]
직사각형을 만드는 데 필요한 4개의 점 중 3개의 좌표가 주어질 때, 나머지 한 점의 좌표를 구하려고 합니다.
점 3개의 좌표가 들어있는 배열 v가 매개변수로 주어질 때, 직사각형을 만드는 데 필요한 나머지 한 점의 좌표를
return 하도록 solution 함수를 완성해주세요. 단, 직사각형의 각 변은 x축, y축에 평행하며,
반드시 직사각형을 만들 수 있는 경우만 입력으로 주어집니다.

[제한사항]
- v는 세 점의 좌표가 들어있는 2차원 배열입니다.
- v의 각 원소는 점의 좌표를 나타내며, 좌표는 [x축 좌표, y축 좌표] 순으로 주어집니다.
- 좌표값은 1 이상 10억 이하의 자연수입니다.
- 직사각형을 만드는 데 필요한 나머지 한 점의 좌표를 [x축 좌표, y축 좌표] 순으로 담아 return 해주세요.

[입출력 예]
v	                        result
[[1, 4], [3, 4], [3, 10]]	[1, 10]
[[1, 1], [2, 2], [1, 2]]	[2, 1]
*/
/**
 * Created by Minseokism on 2017-09-16.
 */
public class Problem03 {

    public static void main(String[] args) {
        Problem03 pr = new Problem03();
        int[][] v = {{1,4},{3,4},{3,10}};

        for (int num : pr.solution(v)) {
            System.out.print(num + " ");
        }
    }

    public int[] solution(int[][] v) {
        int[] answer;
        int num1 = 0;
        int num1Sum = 0;
        int num2 = 0;
        int num2Sum = 0;

        for (int i = 0; i < 3; i++) {
            num1 = v[i][0];
            num1Sum += num1;

            for (int j = i+1; j < 3; j++) {
                if (num1 == v[j][0]) {
                    num1Sum -= num1*2;
                    break;
                }
            }

        }

        for (int i = 0; i < 3; i++) {
            num2 = v[i][1];
            num2Sum += num2;

            for (int j = i+1; j < 3; j++) {
                if (num2 == v[j][1]) {
                    num2Sum -= num2*2;
                    break;
                }
            }
        }

        answer = new int[]{num1Sum,num2Sum};
        return answer;
    }
}
