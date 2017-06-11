/*
    A binary gap within a positive integer N is any maximal sequence of consecutive zeros
    that is surrounded by ones at both ends in the binary representation of N.
    For example, number 9 has binary representation 1001 and contains a binary gap of length 2.
    The number 529 has binary representation 1000010001 and contains two binary gaps: one of length 4 and one of length 3.
    The number 20 has binary representation 10100 and contains one binary gap of length 1.
    The number 15 has binary representation 1111 and has no binary gaps.

    Write a function:

        class Solution { public int solution(int N); }

    that, given a positive integer N, returns the length of its longest binary gap.
    The function should return 0 if N doesn't contain a binary gap.
    For example, given N = 1041 the function should return 5, because N has binary representation 10000010001
     and so its longest binary gap is of length 5.

    Assume that:

        N is an integer within the range [1..2,147,483,647].

    Complexity:

        expected worst-case time complexity is O(log(N));
        expected worst-case space complexity is O(1).

    - 문제 풀이 -

    Integer.toBinaryString()을 이용해서 숫자를 이진수로 변환시킨후, for 을 이용해서
    숫자와 숫자사이의 0의 갯수를 세기 위해서 임시 변수를 하나주어서 0이 나타난 시점부터 0이 아닌 부분까지
    카운팅했다. 0은 1과 1사이에 존재해야하기 때문에 2진수의 마지막 숫자가 0일경우 그때의 카운팅은 무효다.
    그래서 다음 순서의 문자를 읽었을 때 0이 아닐 경우에만 0의 길이와 최대값으로 저장한 숫자를 비교해서
    최대값을 뽑아냈다.
*/

package codility;

/**
 * Created by Minseokism on 2017-06-11.
 */
public class BinaryGap {

    public static void main(String[] args) {
        BinaryGap test = new BinaryGap();
        System.out.println(test.solution(1));
        System.out.println(test.solution(1041));
        System.out.println(test.solution(328));
    }

    public int solution(int N) {
        String binaryString = Integer.toBinaryString(N);

        int max = 0;
        int temp = 0;

        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) == '0') {
                temp++;

            } else {
                if (temp > max) max = temp;
                temp = 0;
            }

        }

        return max;
    }
}
