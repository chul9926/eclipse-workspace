package chapter04;

public class Q4 {

	public static void main(String[] args) {
		
	 int lineCount = 4;  // ����� ���μ�
	 int starCount = 1;  // ���� ��� �ϴ� ����, �ʱⰪ����
	 int spaceCount = 3; // ������ ó���ϴ� ������ ����
	 
	 for (int i=0 ; i < lineCount; i++) {           //������ ó�� �ϴ� for
		 for (int j=0 ; j <spaceCount; j++) {       //��ǥ ������ ���� ó��
			 System.out.print(' ');
	 }
		 for (int j = 0; j < starCount; j++) {      // ��ǥ�� ó��
			 System.out.print('*');
		 }
		 for (int j = 0; j < spaceCount; j++) {     // ��ǥ �������� ���� ó��
			 System.out.print(' ');
	}
         spaceCount -=1;
         starCount +=2;
         System.out.println();
         
	 }
	}
}
