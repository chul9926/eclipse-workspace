package chapter05;

public class Student_Test {
	int studentID;
	String studentName;
	int grade;
	String address;       //왼쪽 4줄은 변수        // 주소를 문자열로 표현하기 위해 String을 씀
	
	
	public void showStudentInfo() {  //메소드 넣는 코드  //showStudentInfo 라는 변수를 선언        ;
		System.out.println(studentName + "," + address);                                  ;
	}                                                                                     ;
	                                                                                      ;
	public static int add(int k1, int k2) {  // add라는 함수명 함수를 선언하고 () <==를 넣어야한다.  ;
		int result = k1 + k2 ;                                                            ;
		return result;   // 리턴이 없으면 변수값에  void를 넣는다, 리턴이 있을땐 int라는 변수를 넣는다.    ; 메소드
	}
	
	public static void main(String[] args) {
	
		int num1 = 10;
		int num2 = 20;
		
		int sum = add(num1, num2);  //add라는 함수를 호출 한 것.
		
		System.out.println(num1 + "+" + num2 + "= " + sum + "입니다."); //add 쪽으로 할당되서 값이 나옴
		
		

	}

}
