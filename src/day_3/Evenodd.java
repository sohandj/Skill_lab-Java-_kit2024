package day_3;

import java.util.Scanner;

public class Evenodd {

	public static void main(String[] args) {
		System.out.println();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if ((n%2)==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }

        sc.close();

	}

}
