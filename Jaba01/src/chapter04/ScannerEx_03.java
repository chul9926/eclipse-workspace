package chapter04;

import java.util.Scanner;

public class ScannerEx_03 {

	public static void main(String[] args) {
       //비교연산
		
		int a = 2;
		int b = 1;
				
				
		System.out.println(a >= b);    // T
		System.out.println(3 >= 2);    // T
		System.out.println(-1 < 0);    // T
		System.out.println(3.45 <= 2); // F
		System.out.println(3 == 2);    // F
		System.out.println(3 != 2);    // T
		System.out.println(!(3 !=2));  // F
		
	}

}
