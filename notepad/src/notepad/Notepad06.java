package notepad;

public class Notepad06 {

	public static void main(String[] args) { // 증가 . 감소 연산자를 사용하여 값 연산하기.

		int gamescore = 150;
		
		int lastscore = gamescore++;
		System.out.println(lastscore); // 150
		
		int lastscore2 = gamescore--;
		System.out.println(lastscore2); // 151 (이월되는 느낌으로 생각해보자)
		
		int lastscore3 = ++gamescore;
		System.out.println(lastscore3); // 151
		
		int lastscore4 = --gamescore;
		System.out.println(lastscore4); // 150
		
	}

}
