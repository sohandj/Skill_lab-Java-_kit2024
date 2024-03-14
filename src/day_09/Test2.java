package day_09;

public class Test2 {

	static int reverse(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }

    // Method for reversing an array
    static int[] reverse(int[] array) {
        int[] reversedArray = new int[array.length];
        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
            reversedArray[j] = array[i];
        }
        return reversedArray;
    }

    // Method for reversing a string
    static String reverse(String text) {
        StringBuilder reversedString = new StringBuilder();
        for (int i = text.length() - 1; i >= 0; i--) {
            reversedString.append(text.charAt(i));
        }
        return reversedString.toString();
    }

    public static void main(String[] args) {
        // Example usage
        int integerValue = 12345;
        int[] intArray = {1, 2, 3, 4, 5};
        String stringValue = "Hello, Method Overloading!";

        // Call methods with different parameter types
        int reversedInteger = reverse(integerValue);
        int[] reversedIntArray = reverse(intArray);
        String reversedString = reverse(stringValue);

        // Display the results
        System.out.println("Reversed Integer: " + reversedInteger);
        System.out.print("Reversed Array: ");
        for (int num : reversedIntArray) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Reversed String: " + reversedString);
    }
}
