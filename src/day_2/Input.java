package day_2;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		System.out.println("");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age : ");
		int n = sc.nextInt();
		if (n>=18) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
		sc.close();

	}

}
