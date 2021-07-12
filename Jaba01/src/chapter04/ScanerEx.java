package chapter04;

import java.util.Scanner;      // 1. Scanner 임포트

public class ScanerEx { //객체지향 scanner

	public static void main(String[] args) {
		System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요");
		Scanner scanner = new Scanner(System.in); // 2. Scanner 객체 생성
		
		String name = scanner.next(); // 문자열 읽기 (next는 문자열을 input 받기 위해 쓰임)
		System.out.println("이름은" + name + ","); // 3. Scanner 에서 받은 값을 변수에 할당
		
		String city = scanner.next(); // 문자열 읽기 (문자열을 input 받기위함이면 맨 앞에 String 써야함)
		System.out.println("도시는" + city + ", ");
		
		int age = scanner.nextInt(); // 정수 읽기   Int( 대문자임 )
		System.out.println("나이는 " + age + "살,");
		
		double weight = scanner.nextDouble(); // 실수 읽기
		System.out.println("체중은 " + weight + "kg,");
		
		boolean single = scanner.nextBoolean(); // 논리값 읽기
		System.out.println("독신 여부는" + single + "입니다.");
		
		scanner.close(); // 4. scanner 닫기
		
		
	}

}
