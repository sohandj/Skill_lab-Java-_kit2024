package day_4;

import java.util.Scanner;

public class DoWhileloop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		int i = 0;
		do {
            i++;
            System.out.println(n + " x " + i + " = " + i*n);
        } while (i <10);
        sc.close();

	}

}
