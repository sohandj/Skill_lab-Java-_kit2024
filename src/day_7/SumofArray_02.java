package day_7;

public class SumofArray_02 {

	public static void main(String[] args) {
		int array[] = {3,9,7,8,12,6,15,5,4,10};
		
//		for(int x : array) {
//			int sum =0;
//			sum = sum +x[i];
//			System.out.println("SUM :" + sum);
//		}
		
		int sum =0;
		for(int i=0;i<array.length;i++) {
			sum = sum +array[i];
		}
		System.out.println("SUM :" + sum);
	}

}
