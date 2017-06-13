/*
    A zero-indexed array A consisting of N integers is given. Rotation of the array means that each element is shifted
    right by one index, and the last element of the array is also moved to the first place.

    For example, the rotation of array A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7].
    The goal is to rotate array A K times; that is, each element of A will be shifted to the right by K indexes.

    Write a function:

    class Solution { public int[] solution(int[] A, int K); }

    that, given a zero-indexed array A consisting of N integers and an integer K, returns the array A rotated K times.

    For example, given array A = [3, 8, 9, 7, 6] and K = 3, the function should return [9, 7, 6, 3, 8].

    Assume that:

    N and K are integers within the range [0..100];
    each element of array A is an integer within the range [−1,000..1,000].

    In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment.

    - 문제 풀이 -
    먼저 int[]의 요소들을 Deque에 넣습니다. Deque에서 마지막을 빼서 처음으로 넣는 과정을 K번째 만큼 반복합니다.
    Deque를 int[] 바꾼후 return 합니다.
 */

package codility;

import java.util.ArrayDeque;
import java.util.Arrays;

/**
 * Created by Minseokism on 2017-06-13.
 */
public class CyclicRotation {

    public static void main(String[] args) {
        CyclicRotation c = new CyclicRotation();
        int[] a = {1,2,3,4,5};
        int[] b = c.solution(a, 3);
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }

    public int[] solution(int[] A, int K) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < A.length; i++) {
            deque.add(A[i]);
        }

        for (int i = 0; i < K; i++) {
            deque.addFirst(deque.pollLast());
        }
        Integer[] array = new Integer[deque.size()];
        deque.toArray(array);

        return Arrays.stream(array).mapToInt(Integer::intValue).toArray();
    }
}
