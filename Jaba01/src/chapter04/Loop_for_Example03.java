package chapter04;

public class Loop_for_Example03 {

	public static void main(String[] args) { //for문

		int num;
		for(num = 1; num <= 5; num++) { //동작 순서 num 1- > true -> 결과 -> ++
			                            //++로 인해 숫자 증가 -> true ->반복
			System.out.println(num);
		}
	}

}
