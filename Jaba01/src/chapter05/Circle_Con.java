package chapter05;

public class Circle_Con { // 두 개의 생성자를 가진 Circle_Con 클래스
	
	int radius;    //;
	String name;   //; 변수 
	
	public Circle_Con() { // <<=== 생성자 (매개변수가 없는 생성자)                        ;
		radius = 1; name = "" ; // radius의 초기값은 1                               ;
	}                                                                           //;
	public Circle_Con(int r, String n ) { //  <== 생성자 : (매개 변수를 가진 생성자)      ;
		radius = r ; name = n;		                                           // ;
	}                                                                          // ;
	public double getArea() {                                                  // ;
		return 3.14*radius*radius;                                             // ;
	}                                                                          // ; 메소드
	public static void main(String[] args) {
		Circle_Con pizza = new Circle_Con(10, "자바피자"); //  <== 매개변수를 가진 생성자를 호출
		
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area);
		
		Circle_Con donut = new Circle_Con(); // <== 매개변수가 없는 생성자를 호출 
		donut.name = "도넛피자";
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은 " + area);ㅇ
	}

}
