package chapter03;

public class OperatorEx05_Test01 {

	public static void main(String[] args) {
		
		int gamescore = 100;
		
		int lastscore = ++gamescore;
		System.out.println(lastscore); //101
		System.out.println(gamescore); //101
		
		int lastscore2 = gamescore--;
		System.out.println(lastscore2); // 101
		System.out.println(gamescore); // 100

	}

}
