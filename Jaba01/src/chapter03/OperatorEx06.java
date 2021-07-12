package chapter03;

public class OperatorEx06 {

	public static void main(String[] args) {
		
		int myage = 27;
		boolean value = (myage > 23);  // myage 27살이 더 크니까  true
		System.out.println(value);
		
		boolean value2 = (myage < 23 ); // 
		System.out.println(value2);
		
		boolean value3 = (myage == 23 ); // == 27, 23은 같지 않다.
		System.out.println(value3);
		
		boolean value4 = (myage != 23); // 두개 항이 다르면 true // 항이 같으면 false
		System.out.println(value4);
		
	}

}
