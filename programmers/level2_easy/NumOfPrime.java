/*
* [소수 찾기]
* numberOfPrime 메소드는 정수 n을 매개변수로 입력받습니다.
* 1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하도록 numberOfPrime 메소드를 만들어 보세요.
*
* 소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다. (1은 소수가 아닙니다.)
*
* 10을 입력받았다면, 1부터 10 사이의 소수는 [2,3,5,7] 4개가 존재하므로 4를 반환
* 5를 입력받았다면, 1부터 5 사이의 소수는 [2,3,5] 3개가 존재하므로 3를 반환
*
* [풀이]
* 에라토스테네스의 체를 이용해서 풀이
* */

package programmers.level2_easy;

import java.util.Arrays;

public class NumOfPrime {
    private int[] arr;
    private int length;

    int numberOfPrime(int n) {
        int result = 0;

        arr = new int[n+1];
        length = arr.length;
        Arrays.fill(arr, 1);
        arr[0] = 0;
        arr[1] = 0;

        for (int i = 2; i <= n; i++) {
            if (arr[i] == 1) {
                if(findPrime(i)) removeNotPrime(i);
            }
        }

        for (int i: arr) {
            result += i;
        }

        return result;
    }

    boolean findPrime(int num) {
        int size = num/2;
        if (num < 4) size = num;

        for (int i = 2 ; i <= size ; i++) {
            if (num/i != 0) return true;
        }

        return false;
    }

    void removeNotPrime(int num) {
        for (int i = 2; num*i < length; i++) {
            arr[num*i] = 0;
        }
    }

    public static void main(String[] args) {
        NumOfPrime prime = new NumOfPrime();
        System.out.println( prime.numberOfPrime(10) );
    }
}
