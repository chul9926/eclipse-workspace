package chapter04;

import java.util.Scanner;      // 1. Scanner ����Ʈ

public class ScanerEx { //��ü���� scanner

	public static void main(String[] args) {
		System.out.println("�̸�, ����, ����, ü��, ���� ���θ� ��ĭ���� �и��Ͽ� �Է��ϼ���");
		Scanner scanner = new Scanner(System.in); // 2. Scanner ��ü ����
		
		String name = scanner.next(); // ���ڿ� �б� (next�� ���ڿ��� input �ޱ� ���� ����)
		System.out.println("�̸���" + name + ","); // 3. Scanner ���� ���� ���� ������ �Ҵ�
		
		String city = scanner.next(); // ���ڿ� �б� (���ڿ��� input �ޱ������̸� �� �տ� String �����)
		System.out.println("���ô�" + city + ", ");
		
		int age = scanner.nextInt(); // ���� �б�   Int( �빮���� )
		System.out.println("���̴� " + age + "��,");
		
		double weight = scanner.nextDouble(); // �Ǽ� �б�
		System.out.println("ü���� " + weight + "kg,");
		
		boolean single = scanner.nextBoolean(); // ���� �б�
		System.out.println("���� ���δ�" + single + "�Դϴ�.");
		
		scanner.close(); // 4. scanner �ݱ�
		
		
	}

}
