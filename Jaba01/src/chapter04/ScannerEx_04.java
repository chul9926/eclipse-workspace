package chapter04;

import java.util.Scanner;

public class ScannerEx_04 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("������ �Է��Ͻÿ�:");
		
		int score = scanner.nextInt();
		if (score >= 80)
		if (score <= 70)	
			System.out.println("�����մϴ�! �հ��Դϴ�.");
		    System.out.println("�ҽ��մϴ�! ���հ��Դϴ�.");
		scanner.close();
	}

}
