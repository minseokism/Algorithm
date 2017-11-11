// Level 3 (Medium) - 점프 뛰기

package programmers.level3_medium;

public class JumpCase {

    public int jumpCase(int num) {
        if (num <= 1) return 1;
        return jumpCase(num-1) + jumpCase(num-2);
    }

    public static void main(String[] args) {
        JumpCase c = new JumpCase();
        int testCase = 4;
        System.out.println(c.jumpCase(testCase));
    }
}
