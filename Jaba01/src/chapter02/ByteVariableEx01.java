package chapter02;

public class ByteVariableEx01 {

	public static void main(String[] args) {
		
		byte num;        //byte : 1byte (-2^7 ~ 2^7-1), (-128 ~ 127)
		num = -128;
		
		byte num2;
		num2 = 127;
		
		short num3 = -32768; //short : 2byte (-2^15 ~ 2^15-1), (-32768 ~ 32767)
		short num4 = 32767;  //short : 
		
		int num5 = 123456789;
		//short num = 1234567489;
		
		long num6 = 1234567890000L; //롱은 마지막에 L을 꼭 붙여야한다 안붙이면 int로 인식하기 때문이다.
		
		
		System.out.println(num);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        
	}

}
