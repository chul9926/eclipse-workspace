package chapter04;

public class Loop_while_Example {

	public static void main(String[] args) {  // while 

		int num = 1;            // num : 1 ~ 10 까지 연산
		int sum = 0;            // sum : 합한 결과를 담은 변수
		
		while(num <= 10) {
			sum += num;           // sum = sum + num
			num++;             
		}
		System.out.println("1부터 10까지의 합은" + sum + "입니다.");
		System.out.println("sum : " + sum);    // sum : 55
		System.out.println("num : " + num);    // num : 11
	}
            // while 반복문인데 num 값이 20보다 낮아 트루이기때문에 계속 더해진다 num 20보다 낮아질때까지.
	
	      //총 정리
	      //sum = 0, num = 1            <== 초기값
	      //sum = 1, num = 2            <== Loop 1
	      //sum = 3, num = 3            <== Loop 2
	      //sum = 6, num = 4            <== Loop 3
	      //sum = 10, num = 5           <== Loop 4
	      //sum = 15, num = 6           <== Loop 5
	      //sum = 21, num = 7           <== Loop 6
	      //sum = 28, num = 8			<== Loop 7
	      //sum = 36, num = 9      		<== Loop 8
	      //sum = 45, num = 10          <== Loop 9
	      
}
