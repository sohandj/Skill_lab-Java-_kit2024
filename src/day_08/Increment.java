package day_08;

import java.util.Scanner;

public class Increment {
	
	static int increment(int x) {
		x = x+1;
		
		return x;
	}
	
	static int inc(int x) {
		x++;
		
		return x;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a = sc.nextInt();
		
		inc(a);
		int c = increment(a);
		

		System.out.println("The incremented number is : " + c);
		System.out.println(a);
	}

}
