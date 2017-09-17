package codingtest.company6;

/**
 * Created by Minseokism on 2017-09-16.
 */
public class Problem01 {

    public static void main(String[] args) {
        Problem01 pr = new Problem01();
        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};

        for (String s: pr.solution(n, arr1, arr2)) {
            System.out.print("["+s + "] ");
        }
    }

    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        StringBuilder sb = new StringBuilder();

        int[] binaryArr1;
        int[] binaryArr2;
        for (int num : arr1) {
            toBinary(num, n);
        }

        for (int i = 0 ; i < n ; i ++) {
            sb.setLength(0);

            binaryArr1 = toBinary(arr1[i], n);
            binaryArr2 = toBinary(arr2[i], n);

            for (int j = 0; j < n; j++) {
                if (binaryArr1[j]+binaryArr2[j] == 0) {
                    sb.append(" ");
                } else {
                    sb.append("#");
                }

            }

            answer[i] = sb.toString();
        }

        return answer;
    }

    public int[] toBinary(int num, int n) {
        int[] binaryArr = new int[n];

        for (int i = n-1 ; i >= 0 ; i--) {
            binaryArr[i] = num % 2;
            num /= 2;
        }

        return binaryArr;
    }


}
