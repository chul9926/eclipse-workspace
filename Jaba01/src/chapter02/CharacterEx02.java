package chapter02;

public class CharacterEx02 {

	public static void main(String[] args) {
		
		char ch1 = '��';
		char ch2 = '\uCCA0';      //'��'�� �����ڵ� �� (uD55C)
		char ch3 = '\uAC38';      // '�����ڵ�' �ۼ��Ҷ� �ҹ��� u �� �־����
		
		//char ch5 = -65; // -�� ��µ��� ����.
		char ch6 = 65;
		
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		System.out.println(ch6);

	}

}
