package chapter04;

public class If_example06_Test {

	public static void main(String[] args) {
		
		int score = 92;
	    char grade;
		
		if (score >= 90) {
			    grade = 'A';
			    System.out.println("당신의 점수는" + score + "입니다. 학점은 " +grade + "입니다.");
		}
		else if (score >= 80) {
			    grade = 'B';
			    System.out.println("당신의 점수는" + score + "입니다. 학점은 " +grade + "입니다.");
		}
		else if (score >= 70) {
			    grade = 'C';
			    System.out.println("당신의 점수는" + score + "입니다. 학점은 " +grade + "입니다.");
		}
		else if (score >= 60) {
			    grade = 'D';
			    System.out.println("당신의 점수는" + score + "입니다. 학점은 " +grade + "입니다.");
		}
		else {
			    grade = 'F';
			    System.out.println("60점 미만은 F입니다.");
			    	
		}
	}

}
