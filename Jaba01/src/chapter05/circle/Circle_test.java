package chapter05.circle;

import chapter05.circle.Circle; //������ �ٸ� class�� �ΰ� ���⼭�� ������� ���

public class Circle_test {

	public static void main(String[] args) { 
			
		
			Circle pizza;
			pizza = new Circle();             // Circle ��ü ����
			pizza.radius = 10;                // ������ �������� 10���� ����
			pizza.name = "�ڹ�����";			  // ������ �̸� ����
			double area = pizza.getArea();    // ������ ���� �˾Ƴ��� (getArea ()�� ȣ�� �ؼ� area ������ �Ҵ�
			System.out.println(pizza.name + "�� ������" + area);
			
			Circle donut = new Circle();      // Circle ��ü ��
			donut.radius = 2;                 // ������ �������� 2�� ����
			donut.name = "�ڹٵ���";            // ������ �̸� ����
		    area = donut.getArea();           // ������ ���� �˾Ƴ���
			System.out.println(donut.name + "�� ������" + area);
	}

}
