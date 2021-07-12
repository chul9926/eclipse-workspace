package chapter05.circle;

import chapter05.circle.Circle; //선언문은 다른 class에 두고 여기서는 결과값만 출력

public class Circle_test {

	public static void main(String[] args) { 
			
		
			Circle pizza;
			pizza = new Circle();             // Circle 객체 생성
			pizza.radius = 10;                // 피자의 반지름을 10으로 설정
			pizza.name = "자바피자";			  // 피자의 이름 설정
			double area = pizza.getArea();    // 피자의 면적 알아내기 (getArea ()를 호출 해서 area 변수에 할당
			System.out.println(pizza.name + "의 면적은" + area);
			
			Circle donut = new Circle();      // Circle 객체 생
			donut.radius = 2;                 // 도넛의 반지름을 2로 설정
			donut.name = "자바도넛";            // 도넛의 이름 설정
		    area = donut.getArea();           // 도넛의 면적 알아내기
			System.out.println(donut.name + "의 면적은" + area);
	}

}
