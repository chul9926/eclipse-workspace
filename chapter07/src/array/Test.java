package array;

public class Test { // 배열 실습

	public static void main(String[] args) {

		int[][] arr = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};		
		
		
		double total = 1;
		
		for(int i = 0; i <arr.length; i++) {
			for(int j = 0; j <arr[i].length; j++) {
			System.out.println(arr[i][j]);
			
			total *= arr[i][j];
		}
		}	
		System.out.println("total : " + total);
		
	}

}
