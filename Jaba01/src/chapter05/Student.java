package chapter05;

public class Student { //학생 클래스 만들기
	
	int studentID;                 //학번                       ;
	String studentName;            //학생 이름                   ;
	int grade;                     //학년                       ;
	String address;                //사는 곳                     ; 멤버 변수 (속성)
	
	public void showStudentInfo() {                                               //;
		System.out.println( studentName + ", " + address ); //이름, 주소 출력 하는 메서드//;
	}                                                                             //;
	public String getstudentName() {                                              //;
		return studentName;                                                       //;
	}                                                                             //;
    public void setStudentName(String Name ) {                                    //;
    	studentName = Name;                                                       //;
    }                                                                             //; 기능 (메서드)
    
    
    
	public static void main(String[] args) {     //Student 클래스 타입의  studentAhn을 선언해서
		Student studentAhn = new Student();      //studentAhn객체의 studentName을 안연수로 저장한것.
		studentAhn.studentName = "안연수";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getstudentName());
		

	}

}
