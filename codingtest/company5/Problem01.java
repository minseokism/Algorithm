package codingtest.company5;

/*
- 문제 설명
자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.

- 제한사항
N의 범위 : 100,000,000 이하의 자연수

- 입출력 예
N	answer
123	6
987	24
*/


/**
 * Created by Minseokism on 2017-09-15.
 */
public class Problem01 {

    public static void main(String[] args) {
        Problem01 pr = new Problem01();
        System.out.println(pr.solution(123));
        System.out.println(pr.solution(987));
    }

    public int solution(int n) {
        int answer = 0;

        while (n != 0) {
            answer += n % 10;
            n /= 10;
        }

        return answer;
    }
}
