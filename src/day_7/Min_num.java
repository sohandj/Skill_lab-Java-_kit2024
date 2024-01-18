package day_7;

public class Min_num {

	public static void main(String[] args) {
		int num[] = {3,9,7,8,12,6,15,5,4,10};
		
		 int min = num[0];

	        for (int i = 1; i < num.length; i++) {
	            if (num[i] < min) {
	                min = num[i];
	            }
	        }
	        System.out.println("The minimum number in the num is: " + min);
	}
	

}
