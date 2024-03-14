package day_08;

public class Arr_max {
	public static int findxElement(int[] array) {
        

        int x = array[0]; 

        for (int i = 1; i < array.length; i++) {
            if (array[i] > x) {
                x = array[i];
            }
        }

        return x;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 5, 8, 20, 3, 15}; 
        int result = findxElement(numbers);

        if (result != Integer.MIN_VALUE) {
            System.out.println("The x element in the array is: " + result);
        }
    }
}
