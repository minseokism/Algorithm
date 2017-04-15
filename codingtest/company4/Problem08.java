/** 8. 감옥에 120명의 죄수가 있다.
 *  간수는 복도를 120번 동안 다음 조건에 지나갔다.
 *  처음에 문은 모두 닫혀 있다.
 *  N번째 지나갈 때에는 N의 배수인 문들이 열려 있으면 닫고, 닫혀 있으면 연다.
 *  마지막에 문이 열려 있으면 그 방의 죄수는 석방이다.
 *  과연 몇 명의 죄수가 석방될까?
 */

package codingtest.company4;

public class Problem08 {
	
	public static void main(String[] args) {
		int cnt = 0;
		int prisonCellNum = 1;
		
		for (int i = 2 ; prisonCellNum <= 120 ; i++) {
			cnt++;			
			prisonCellNum += (2 * i) - 1;
		}
		
		System.out.println(cnt);
	}

}
		
/*		[ 하나하나 바꿔서 푸는 방법 ]
  		boolean[] prisonCells = new boolean[121];
		int cnt = 0;
		int cellNumber;

		for (int i = 1 ; i <= 120 ; i++) {
			cellNumber = i;
			
			for (int j = 2 ; cellNumber <= 120 ; j++) {
				prisonCells[cellNumber] = !prisonCells[cellNumber];
				cellNumber = i * j;
			}
		}
		
		for (int i = 1 ; i <= 120 ; i++) {
			if ( prisonCells[i] ) {
				System.out.println(i);
				cnt++;
			}
 		}
		
		System.out.println("\n"+cnt);*/
