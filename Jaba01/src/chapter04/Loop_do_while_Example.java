package chapter04;

public class Loop_do_while_Example {

	public static void main(String[] args) {  // do while�� 

		int num = 1;             
		int sum = 0;              
		
		do {     //while�� �ٸ��� ������ �����ϰ� ������ ��.
			sum += num;     //sum = sum + num
			num++;
			
		} while(num <= 10);    
		
		System.out.println("1���� 10������ ����" + sum + "�Դϴ�");
		System.out.println("sum : " + sum);
		System.out.println("num : " + num);
	}

}
