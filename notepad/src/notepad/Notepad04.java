package notepad;

public class Notepad04 { // ������ ����ȯ ���� �� ���� ū���δ� �ڵ����� �Ѿ, ū������ �������δ� ������ �Ѱܾ��ϸ�, �����ͼս��� ���� �� ����.

	public static void main(String[] args) {

		byte bnum = 10;
		int inum = bnum;
		
		System.out.println(bnum); // 10
		System.out.println(inum); // 10
		
		int inum2 = 20;
		float fnum = inum2;
		
		System.out.println(inum); // 10
		System.out.println(fnum); // 20.0
		
		double dnum;
		dnum = fnum = inum;
		
		System.out.println(dnum); // 30.0
	}

}
