package chapter02;

public class ImplicitConversion {

	public static void main(String[] args) {
		
		byte bNum = 10;
		int iNum = bNum;       // byte�� ���� int�� ������ ���Ե�
		
		System.out.println(bNum);           //1byte : byte
		System.out.println(iNum);           //4byte : int
		
		int iNum2 = 20;
		float fNum = iNum2;
		
		System.out.println(iNum2);        //int
		System.out.println(fNum);         //float
		
		
		double dNum;
		dNum = fNum + iNum;                //float + int
		System.out.println(dNum);          //double

	}

}
