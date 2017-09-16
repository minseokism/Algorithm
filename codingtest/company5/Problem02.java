package codingtest.company5;

/*
[문제 설명]
길이가 n인 배열에 1부터 n까지 숫자가 중복 없이 한 번씩 들어 있는지를 확인하려고 합니다.
1부터 n까지 숫자가 중복 없이 한 번씩 들어 있는 경우 true를, 아닌 경우 false를 반환하도록 함수 solution을 완성해주세요.

[제한사항]
배열의 길이는 10만 이하입니다.
배열의 원소는 10만 이하의 자연수입니다.


[입출력 예]
arr	            result
[4, 1, 3, 2]	true
[4, 1, 3]	    false
*/

import java.util.Arrays;

/**
 * Created by Minseokism on 2017-09-15.
 */
public class Problem02 {
    public static void main(String[] args) {
        Problem02 pr = new Problem02();
        int[] arr1 = {4,1,3,2};
        int[] arr2 = {4,1,3};

        System.out.println(pr.solution(arr1));
        System.out.println(pr.solution(arr2));
    }

    public boolean solution(int[] arr) {
        boolean answer = true;
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if (i+1 != arr[i]) {
                answer = false;
                break;
            }
        }

        return answer;
    }

}
