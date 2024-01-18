package day_7;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
	
		int array[] = {3,9,7,8,12,6,15,5,4,10};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to find");
		int key = sc.nextInt();
		
		for(int i = 0; i<array.length;i++) {
			if(key== array[i]) {
				System.out.println("Found at position :" + i+1);
				break;
			}
			sc.close();
		}
		System.out.println("not found");
	}
	

}
