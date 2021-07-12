package chapter05.circle;

public class Circle { //선언문만 적어놓음 결과값은 다른 클래스에서

	int radius;          // 원의 반지름 필드          ;
	String name;         // 원의 이름 필드           ; 변수 (속성)
	
	public Circle() {}   // 원의 생성자 (class 이름과 동일한 메서드를 "생성자"라고 얘기한다.                 ;
	                     // input 매개변수도 없고, 실행부가 없는 생성자 : 기본 생성자, 기본생성자는 생략이 가능   ; 생성자
	
	public double getArea( ) { //원의 면적 계산 메소드    ;
		return 3.14*radius*radius;                //;
	}                                             //; 메서드( 기능)     (맨 위에서 여기까지가 선
	
}
