package chapter02;

public class CharacterEx02 {

	public static void main(String[] args) {
		
		char ch1 = '한';
		char ch2 = '\uCCA0';      //'한'의 유니코드 값 (uD55C)
		char ch3 = '\uAC38';      // '유니코드' 작성할때 소문자 u 꼭 넣어야함
		
		//char ch5 = -65; // -는 출력되지 않음.
		char ch6 = 65;
		
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		System.out.println(ch6);

	}

}
