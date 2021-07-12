package chapter04;

public class Loop_do_while_Example {

	public static void main(String[] args) {  // do while문 

		int num = 1;             
		int sum = 0;              
		
		do {     //while과 다르게 조건을 무시하고 실행을 함.
			sum += num;     //sum = sum + num
			num++;
			
		} while(num <= 10);    
		
		System.out.println("1부터 10까지의 합은" + sum + "입니다");
		System.out.println("sum : " + sum);
		System.out.println("num : " + num);
	}

}
