package chapter04;

public class Loop_while_Example {

	public static void main(String[] args) {  // while 

		int num = 1;            // num : 1 ~ 10 ���� ����
		int sum = 0;            // sum : ���� ����� ���� ����
		
		while(num <= 10) {
			sum += num;           // sum = sum + num
			num++;             
		}
		System.out.println("1���� 10������ ����" + sum + "�Դϴ�.");
		System.out.println("sum : " + sum);    // sum : 55
		System.out.println("num : " + num);    // num : 11
	}
            // while �ݺ����ε� num ���� 20���� ���� Ʈ���̱⶧���� ��� �������� num 20���� ������������.
	
	      //�� ����
	      //sum = 0, num = 1            <== �ʱⰪ
	      //sum = 1, num = 2            <== Loop 1
	      //sum = 3, num = 3            <== Loop 2
	      //sum = 6, num = 4            <== Loop 3
	      //sum = 10, num = 5           <== Loop 4
	      //sum = 15, num = 6           <== Loop 5
	      //sum = 21, num = 7           <== Loop 6
	      //sum = 28, num = 8			<== Loop 7
	      //sum = 36, num = 9      		<== Loop 8
	      //sum = 45, num = 10          <== Loop 9
	      
}
