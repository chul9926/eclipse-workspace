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
		
		Notepad.name = "�����ذ��������� ���ѻ���";
		Notepad.address = "����";
		Notepad.grade = "���� 1";
		Notepad.ID = 69696969;
		
		System.out.println("�л��̸� :" + Notepad.name);
		System.out.println("�ּ� :" + Notepad.address);
		System.out.println("�г� :" + Notepad.grade + "�г�");
		System.out.println("���̵� :" + Notepad.ID);
	}

}