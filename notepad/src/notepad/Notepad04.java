package notepad;

public class Notepad04 { // 묵시적 형변환 작은 수 에서 큰수로는 자동으로 넘어감, 큰수에서 작은수로는 강제로 넘겨야하며, 데이터손실이 있을 수 있음.

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
