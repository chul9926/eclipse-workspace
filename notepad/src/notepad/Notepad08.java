package notepad;

public class Notepad08 {

	String address;
	String name;
	String grade;
	int ID;
	
	public String getname() {
		return name;
	
	}
	public static void main(String[] args) {
		
		Notepad08 Notepad = new Notepad08();
		
		Notepad.name = "유세준개벌레보다 못한새끼";
		Notepad.address = "인제";
		Notepad.grade = "유급 1";
		Notepad.ID = 69696969;
		
		System.out.println("학생이름 :" + Notepad.name);
		System.out.println("주소 :" + Notepad.address);
		System.out.println("학년 :" + Notepad.grade + "학년");
		System.out.println("아이디 :" + Notepad.ID);
	}

}
