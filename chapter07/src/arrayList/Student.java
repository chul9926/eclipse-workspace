package arrayList;
import java.util.ArrayList;

public class Student {
	int studentID;
	String studentName;
	ArrayList<Subject> subjectList;  // ArrayList �����ϱ�
									 //  ��� ��ü�� �迭 ����
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		subjectList = new ArrayList<Subject>(); // ArrayList ����   // 4���� ������

	}
	public void addSubject(String name, int score) {
		Subject subject = new Subject();	//Subject �����ϱ�
		subject.setName(name);				//���� �̸� �߰��ϱ�					
		subject.setScorePoint(score);		//���� �߰��ϱ�
		subjectList.add(subject);			//�迭�� �����ϱ� 				// �л��� �����ϴ� ������ subjectList �迭�� �ϳ��� �߰��ϴ� �޼���
	}
	
	public void showStudentInfo() {		// �迭 ��� �� ���
		int total = 0;
		for(Subject s : subjectList) {
			total += s.getScorePoint(); 	//���� ���ϱ�
			System.out.println("�л� " + studentName + "�� " + s.getName() + "�������� " + s.getScorePoint() + "�Դϴ�."  );	
		}									
		System.out.println("�л� " + studentName + "�� ������ " + total + "���̴�.");
	}
}