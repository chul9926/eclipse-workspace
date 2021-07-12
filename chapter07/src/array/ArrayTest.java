package array;

public class ArrayTest {

	public static void main(String[] args) { //배열을 활용
		
		int[] num = new int[] {1,2,3,4,5,6,7,8,9,10};	// 배열 num
		//int[] num = {1,2,3,4,5,6,7,8,9,10};
		
		for(int i= 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		
		System.out.println();
		System.out.println(num[0]);			// 0번이라는게 인덱스임 인덱스는 방번호로 해석해도됨.
		System.out.println(num.length);

}
}
