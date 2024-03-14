package day_08;

import java.util.Scanner;

public class Max {
	
	static int max (int a, int b) {
		if(a>b) {
			return a;
		}
		else {
			return b;
		}
	}
	
	static int increment(int x) {
		x = x+1;
		
		return x;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a = sc.nextInt();
//		System.out.println("Enter another number : ");
//		int b = sc.nextInt();
//		int c = max(a,b);
		
		int c = increment(a);
		
//		System.out.println("The maximum number is : " + c);
		System.out.println("The incremented number is : " + c);
	}

}
