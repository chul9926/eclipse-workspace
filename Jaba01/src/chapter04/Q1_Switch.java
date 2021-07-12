package chapter04;

import java.util.Scanner;

public class Q1_Switch { // 123p Q1문제 switch 문제로 변형해서 푼것.

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		int result = 0;
		
		System.out.println("연산자를 입력해 주세요 예) +, -, *, /");
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		char operator = S.charAt(0);
		
		switch(operator) {
		     case '+':
		         result = num1 + num2;
                 break;
		     case '-':
		    	 result = num1 - num2;
		    	 break;
		     case '*':
		    	 result = num1 * num2;
		    	 break;
		     case '/':
		    	 result = num1 / num2;
		    	 break;
		    	default:
		    		System.out.println("연산자 오류입니다.");
		    		sc.close();
		    		return;
		}
		System.out.println("결과 값은" + result + "입니다.");
		sc.close();
	}

}
