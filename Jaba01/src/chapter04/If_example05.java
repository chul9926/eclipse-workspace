package chapter04;

public class If_example05 {

	public static void main(String[] args) {

		int age = 5;
		int charge;
		
		// if ~ else if ~ 구문에서 else를 뺀 경우 출력
		
		if (age <7) {
			    charge = 0;
			    System.out.println("애기입니다.");
		}
		if (age <8) {
			    charge = 1000;
			    System.out.println("미 취학 아동입니다.");
		}
		if (age < 14) {
			    charge = 2000;
			    System.out.println("초등학생 입니다.");
		}
		if (age < 20) {
			    charge = 2500;
			    System.out.println("중. 고등 학생입니다.");
		}
		else {
			    charge = 3000;
			    System.out.println("일반인 입니다.");
		}
		System.out.println("입장료는" + charge + "입니다. ");

	}

}
