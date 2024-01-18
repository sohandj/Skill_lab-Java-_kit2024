package day_7;

public class Max_num {

	public static void main(String[] args) {
		int array[] = {3,9,7,8,12,6,15,5,4,10};
		
		 int max = array[0];

	        for (int i = 1; i < array.length; i++) {
	            if (array[i] > max) {
	                max = array[i];
	            }
	        }

	        System.out.println("The maximum number in the array is: " + max);
	}

}
