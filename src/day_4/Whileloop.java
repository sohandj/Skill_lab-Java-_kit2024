package day_4;

import java.util.Scanner;

public class Whileloop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int i = 1;

        System.out.print("Enter any number : ");
        int n = sc.nextInt();
        while (i <=10) {
            System.out.println(n + " x " + i + " = " + i*n);
            i++;
        }
        sc.close();

	}

}
