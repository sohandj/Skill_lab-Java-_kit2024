package day_4;

import java.util.Scanner;

public class Forloop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = sc.nextInt();
        for(int i = 1; i <= 10;i++){
            System.out.println(n + " x " + i + " = " + i*n);
        }
        sc.close();
	}

}
