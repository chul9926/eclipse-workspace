package chapter05;

public class Student_Test02 { // p152 ��ȥ���ڵ� ����1��
	
	int PersonAge;
	String PersonName;
	boolean isMarried;
	int PersonChildren;

	public void showStudentInfo() {
		System.out.println("PersonAge, "+" PersonChildren");
	}
		
	public static int Age(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}
	
	public static void main(String[] args) {

		int num1 = 40;
		int num2= 3;
		
		int sum = Age(num1, num2);
		System.out.println("�����" + num1 + "���̰� �ڳ��" + num2 + "���Դϴ�." );
		
	}

}
