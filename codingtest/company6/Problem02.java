package codingtest.company6;

/**
 * Created by Minseokism on 2017-09-16.
 */
public class Problem02 {

    public static void main(String[] args) {
        Problem02 pr = new Problem02();
        System.out.println(pr.solution("1S2D*3T"));
        System.out.println(pr.solution("1D2S#10S"));
        System.out.println(pr.solution("1D2S0T"));
        System.out.println(pr.solution("1S*2T*3S"));
        System.out.println(pr.solution("1D#2S*3S"));
        System.out.println(pr.solution("1T2D3D#"));
        System.out.println(pr.solution("1D2S3T*"));
    }

    public int solution(String dartResult) {
        int[] points = new int[3];
        String[] dartArr = splitPoint(dartResult);
        int point, option;
        String bonusOption;
        char bonus, charOption;

        for (int i = 0; i < 3; i++) {
            charOption = ' ';
            option = 1;

            point = Integer.parseInt(dartArr[i].replaceAll("[^0-9]", ""));
            bonusOption = dartArr[i].replaceAll("[0-9]","");
            bonus = bonusOption.charAt(0);

            if (bonusOption.length() == 2) {
                charOption = bonusOption.charAt(1);
            }

            if (charOption == '*') {
                option = 2;

                if (i != 0) {
                    points[i-1] *= option;
                }

            } else if (charOption == '#') {
                option = -1;
            }

            if (bonus == 'S') points[i] = point;
            else if (bonus == 'D') points[i] = point * point;
            else points[i] = point * point * point;

            points[i] *= option;
        }

        return points[0]+points[1]+points[2];
    }

    private String[] splitPoint(String dartResult) {
        String[] dartArr = new String[3];
        char numberChar;

        for (int i = 0; i < 2; i++) {
            for (int j = 2; j < 4; j++) {
                numberChar = dartResult.charAt(j);

                if(numberChar >= '0' && numberChar <= '9') {
                    dartArr[i] = dartResult.substring(0, j);
                    dartResult = dartResult.substring(j, dartResult.length());
                    break;
                }
            }
        }

        dartArr[2] = dartResult;
        System.out.println(dartArr[0] +" " + dartArr[1] + " " + dartArr[2]);
        return dartArr;
    }

}
