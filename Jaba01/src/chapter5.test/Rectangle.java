package chapter5.test;

import java.util.Scanner;

public class Rectangle { // ���̿� ���̸� �Է� �޾� �簢���� ���� ����ϴ� ���α׷��� �ۼ��϶�. ����(width)�� ����(height)
	                     // �ʵ�, �׸��� ���� ���� �����ϴ� getArea() �޼ҵ带 ���� Rectangle Ŭ������ ����� Ȱ���϶�.
	int width;
	int height;
	
	public int getArea() {
		return width*height;
	}

	public static void main(String[] args) {
		Rectangle rect = new Rectangle(); //��ü ����
		Scanner scanner = new Scanner(System.in);		
		System.out.println(">> ");
		
		rect.width = scanner.nextInt();
		rect.height = scanner.nextInt();
		
		System.out.println("�簢���� ������" + rect.getArea());
		
		scanner.close();
		
	}

}