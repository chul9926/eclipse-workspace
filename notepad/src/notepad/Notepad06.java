package notepad;

public class Notepad06 {

	public static void main(String[] args) { // ���� . ���� �����ڸ� ����Ͽ� �� �����ϱ�.

		int gamescore = 150;
		
		int lastscore = gamescore++;
		System.out.println(lastscore); // 150
		
		int lastscore2 = gamescore--;
		System.out.println(lastscore2); // 151 (�̿��Ǵ� �������� �����غ���)
		
		int lastscore3 = ++gamescore;
		System.out.println(lastscore3); // 151
		
		int lastscore4 = --gamescore;
		System.out.println(lastscore4); // 150
		
	}

}
