package chapter03;

public class OperatorEx04 {

	public static void main(String[] args) {
		
				int gameScore = 150;
				
				
				int lastScore1 = ++gameScore;    // ; ó�� ���� ����
				System.out.println(lastScore1);  // 151
				System.out.println(gameScore);   // 151
				
				int lastScore2 = gameScore--;    // ; ó�� �Ŀ� ����
				System.out.println(lastScore2);  // 151 
				System.out.println(gameScore);   // 150

			}

	

	}
