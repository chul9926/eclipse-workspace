package chapter03;

public class OperatorEx13 {

	public static void main(String[] args) {
		
		int num1 = 10; // 00000000 00000000 00000000 00001010
		int num2 = 5;        // 11111111 11111111 11111111 11110101
		
		int result = ~num1;                 // -11   NOT연산
		int result2 = num1 & num2;          // 0     AND연산
		int result3 = num1 | num2;          // 15    OR 연산
		int result4 = num1 ^ num2;          // 15    XOR연산
		
		System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
	}

}
