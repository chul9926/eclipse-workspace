package chapter02;

public class Q4 {

	public static void main(String[] args) {
		
		int i = 10;
		double j = 2.0;
		
		System.out.println(i+j);     // 암시적( 묵시적 ) 변환 int -> double로 바뀜
		
		System.out.println((int)(i+j)); // 명시적 변환
		System.out.println((int)(i-j));
		System.out.println((int)(i*j));
		System.out.println((int)(i/j));
	}

}
