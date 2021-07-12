package chapter04;

public class Loop_for_Example04 {

	public static void main(String[] args) { // 구구단

		int dan;
		int times;
		
		for(dan = 1; dan <10; dan++) { //1단 ~ 9단 
			for(times = 1; times <= 9; times++) { // 2x2~9까지 곱하는것
			System.out.println(dan + "X" + times + "=" + dan * times);	
			}
			System.out.println( );
		}
			
	}

}
