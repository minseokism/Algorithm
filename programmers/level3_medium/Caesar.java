// Level 3 (Medium) - 시저 암호

package programmers.level3_medium;

public class Caesar {
    String caesar(String s, int n) {
        String result = "";
        char temp;
        n %= 26;

        for (int i = 0; i < s.length(); i++) {
            temp = s.charAt(i);
            if (temp != ' ') {
                if (temp <= 'Z' && temp+n > 'Z' || (temp >= 'a' && temp+n > 'z')) temp -= 26;
                temp += n;
            }
            result += temp;
        }
        return result;
    }

    public static void main(String[] args) {
        Caesar c = new Caesar();
        System.out.println("s는 'a B z', n은 4인 경우: " + c.caesar("a B z", 4));
    }
}
