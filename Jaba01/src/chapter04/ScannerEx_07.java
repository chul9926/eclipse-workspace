package chapter04;

import java.util.Scanner;
public class ScannerEx_07 {// ������ �г��� �Է� �޾� 60�� �̻��̸� �հ�,
	                       // �̸��̸� ���հ��� ����Ѵ�. 4�г��� ��� 70�� �̻��̾�� �հ�

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ���(0~100):");
		int score = scanner.nextInt();
		
		System.out.println("�г��� �Է��ϼ���(1~4):");
		int year = scanner.nextInt();
		
		if(score >= 60) { //60�� �̻�
			if(year != 4)
				System.out.println("�հ�"); // 4�г� �ƴϸ� �հ�
			else if(score >= 70)
				System.out.println("�հ�!"); // 4�г��� 70�� �̻��̸� �հ�
			else
				System.out.println("���հ�!"); // 4�г��� 70�� �̸��̸� ���հ�
		}
		else // 60�� �̸� ���հ�
			System.out.println("���հ�!");
		
		scanner.close();
	}

}
