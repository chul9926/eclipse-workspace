package chapter05.circle;

public class Circle { //���𹮸� ������� ������� �ٸ� Ŭ��������

	int radius;          // ���� ������ �ʵ�          ;
	String name;         // ���� �̸� �ʵ�           ; ���� (�Ӽ�)
	
	public Circle() {}   // ���� ������ (class �̸��� ������ �޼��带 "������"��� ����Ѵ�.                 ;
	                     // input �Ű������� ����, ����ΰ� ���� ������ : �⺻ ������, �⺻�����ڴ� ������ ����   ; ������
	
	public double getArea( ) { //���� ���� ��� �޼ҵ�    ;
		return 3.14*radius*radius;                //;
	}                                             //; �޼���( ���)     (�� ������ ��������� ��
	
}
