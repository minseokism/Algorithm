/** 6. 1부터 10,000까지 8이라는 숫자가 총 몇번 나오는가?
 * 	8이 포함되어 있는 숫자의 갯수를 카운팅 하는 것이 아니라 8이라는 숫자를 모두 카운팅 해야 한다.
 *  (※ 예를들어 8808은 3, 88888은 4로 카운팅 해야 함)
 */

package codingtest.company4;

public class Problem06 {
	
	public static void main(String[] args) {
		int sum = 0;
		
		for (int i = 1 ; i <= 10000 ; i++) {
			sum += findNumber(i + "");		
		}

		System.out.println(sum);
		
	}
	
	public static int findNumber(String number) {
		int total = 0;
		int length = number.length();

		for(int i = 0 ; i < length ; i++) {
			if (number.charAt(i) == '8') total++;
		}
		
		return total;
	}
	
}
