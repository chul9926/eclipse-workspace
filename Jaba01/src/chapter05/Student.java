package chapter05;

public class Student { //�л� Ŭ���� �����
	
	int studentID;                 //�й�                       ;
	String studentName;            //�л� �̸�                   ;
	int grade;                     //�г�                       ;
	String address;                //��� ��                     ; ��� ���� (�Ӽ�)
	
	public void showStudentInfo() {                                               //;
		System.out.println( studentName + ", " + address ); //�̸�, �ּ� ��� �ϴ� �޼���//;
	}                                                                             //;
	public String getstudentName() {                                              //;
		return studentName;                                                       //;
	}                                                                             //;
    public void setStudentName(String Name ) {                                    //;
    	studentName = Name;                                                       //;
    }                                                                             //; ��� (�޼���)
    
    
    
	public static void main(String[] args) {     //Student Ŭ���� Ÿ����  studentAhn�� �����ؼ�
		Student studentAhn = new Student();      //studentAhn��ü�� studentName�� �ȿ����� �����Ѱ�.
		studentAhn.studentName = "�ȿ���";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getstudentName());
		

	}

}
