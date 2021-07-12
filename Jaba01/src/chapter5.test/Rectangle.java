package chapter5.test;

import java.util.Scanner;

public class Rectangle { // 넓이와 높이를 입력 받아 사각형의 합을 출력하는 프로그램을 작성하라. 넓이(width)와 높이(height)
	                     // 필드, 그리고 면적 값을 제공하는 getArea() 메소드를 가진 Rectangle 클래스를 만들어 활용하라.
	int width;
	int height;
	
	public int getArea() {
		return width*height;
	}

	public static void main(String[] args) {
		Rectangle rect = new Rectangle(); //객체 생성
		Scanner scanner = new Scanner(System.in);		
		System.out.println(">> ");
		
		rect.width = scanner.nextInt();
		rect.height = scanner.nextInt();
		
		System.out.println("사각형의 면적은" + rect.getArea());
		
		scanner.close();
		
	}

}