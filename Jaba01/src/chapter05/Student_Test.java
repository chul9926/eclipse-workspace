package chapter05;

public class Student_Test {
	int studentID;
	String studentName;
	int grade;
	String address;       //���� 4���� ����        // �ּҸ� ���ڿ��� ǥ���ϱ� ���� String�� ��
	
	
	public void showStudentInfo() {  //�޼ҵ� �ִ� �ڵ�  //showStudentInfo ��� ������ ����        ;
		System.out.println(studentName + "," + address);                                  ;
	}                                                                                     ;
	                                                                                      ;
	public static int add(int k1, int k2) {  // add��� �Լ��� �Լ��� �����ϰ� () <==�� �־���Ѵ�.  ;
		int result = k1 + k2 ;                                                            ;
		return result;   // ������ ������ ��������  void�� �ִ´�, ������ ������ int��� ������ �ִ´�.    ; �޼ҵ�
	}
	
	public static void main(String[] args) {
	
		int num1 = 10;
		int num2 = 20;
		
		int sum = add(num1, num2);  //add��� �Լ��� ȣ�� �� ��.
		
		System.out.println(num1 + "+" + num2 + "= " + sum + "�Դϴ�."); //add ������ �Ҵ�Ǽ� ���� ����
		
		

	}

}
