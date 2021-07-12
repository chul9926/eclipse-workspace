package chapter03;

public class OperatorEx11 {

	public static void main(String[] args) {
	
		int num1 = 10;
		int num2 = 20;
		
		num1 += num2;
		System.out.println(num1);      // num1 = num1 + num2
		
		num1 -= num2;
		System.out.println(num1);      // num1 = num1 - num2 
		
		num1 *= 2;
		System.out.println(num1);      // num1 = num1 * 2
		
		num1 /= 2;
		System.out.println(num1);      // num1 = num1 / 2
		
		num1 %= 2;
		System.out.println(num1);      // num1 = num1 % 2
				
        // num1 값이 순서대로 값이 변하면서 내려옴 
	}

}
