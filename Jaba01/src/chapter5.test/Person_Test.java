package chapter5.test;

public class Person_Test { // p152 Q1

	public static void main(String[] args) {
		
		Person person = new Person();
		person.age = 40;
		person.name = "James";
		person.isMarried = true;
		person.numberOfchildren = 3;
		
		System.out.println("���� :" + person.age);
		System.out.println("�̸� :" + person.name);
		System.out.println("��ȥ ���� :" + person.isMarried);
		System.out.println("�ڳ� �� :" + person.numberOfchildren);
		
		
	}

}
