package day_3;

import java.util.Scanner;

public class BigNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter number a:");
        int a = sc.nextInt();
        System.out.print("Enter number b:");
        int b = sc.nextInt();
        System.out.print("Enter number c:");
        int c = sc.nextInt();

        if ((a > b) && (a > c)) {
            System.out.println(" a is greater ");
        }
        if ((b > c) && (b > a)) {
            System.out.println(" b is greater  ");
        }
        if ((c > b) && (c > a)) {
            System.out.println(" c is greater ");

        }

        sc.close();
	}
}
