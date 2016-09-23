/*
 	Q1. 개인정보가 포함된 문자열의 일부를 가리는 함수를 작성해주세요.
 	
 	문자열은 a) 앞에서부터 n개의 글자를 가릴수도 있고,
 		  b) 앞에서부터 n개의 글자를 제외한 나머지를 가릴수도 있고,
 		  c) 뒤에서부터 n개의 글자를 가릴수도 있고,
 		  d) 뒤에서부터 n개의 글자를 제외한 나머지를 가릴수도 있습니다.
 		  
 	입력인자 :
 	Name		Type		Description
 	s			string		개인정보가 포함된 문자열
 	is_fornt	boolean		앞에서부터 가릴지 여부, true면 앞에서부터 가림, false면 뒤에서부터 가림
 	no_chars	integer		몇개의 문자를 가릴지 혹은 몇개의 문자만 보여줄지를 나태내는 값
 	is_positive	boolean		true면 no_chars만큼의 글자를 제외하고 가림, false면 no_chars만큼의 글자를 가림
	
	반환값 : 입력된 인자에 따라 개인정보가 * 문자로 가려진 문자열을 반환합니다.

	예시 :
	mask('abcde', true, 3, true)
	> 'abc**'
	mask('abcde', false, 2, true)
	> '***de'
	mask('abcdef', true, 3, false)
	> '***def'
	mask('abcdef', false, 3, false)
	> 'abc***'
*/
package codingtest.company1;

public class Q1 {

	public static void main(String[] args) {
		mask("abcde", true, 3, false);		// a) 앞에서부터 n개의 글자를 가립니다.
		mask("abcde", true, 3, true);		// b) 앞에서부터 n개의 글자를 제외한 나머지를 가립니다.
		mask("abcde", false, 3, false);		// c) 뒤에서부터 n개의 글자를 가립니다.
		mask("abcde", false, 3, true);		// d) 뒤에서부터 n개의 글자를 제외한 나머지를 가립니다.
	}

	public static void mask(String s, boolean is_front, int no_chars, boolean is_positive) {

		int chars = s.length() - no_chars;
		
		if (is_front) {
			if (is_positive) {								// true, true   b)
				s = s.substring(0, no_chars);
				for (int i = 0; i < chars; i++) s += "*";
			} else {										// true, false  a)
				s = s.substring(no_chars);
				for (int i = 0; i < no_chars; i++) s = "*" + s; 
			}
		} else {
			if(is_positive) {								// false, true  d)
				s = s.substring(chars);
				for (int i = 0; i < chars; i++) s = "*" + s;
			} else {										// false, false c)
				s = s.substring(0, s.length() - no_chars);
				for (int i = 0; i < no_chars; i++) s += "*";
			}
		}
		
		System.out.println(s);
	}
}