package chapter04;

public class Loop_for_Example04 {

	public static void main(String[] args) { // ������

		int dan;
		int times;
		
		for(dan = 1; dan <10; dan++) { //1�� ~ 9�� 
			for(times = 1; times <= 9; times++) { // 2x2~9���� ���ϴ°�
			System.out.println(dan + "X" + times + "=" + dan * times);	
			}
			System.out.println( );
		}
			
	}

}
