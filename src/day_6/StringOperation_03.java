package day_6;

import java.util.Scanner;

public class StringOperation_03 {

	public static void main(String[] args) {
		// find the username and domain name for email
		
		System.out.print("Enter Email id : " );
		Scanner sc = new Scanner(System.in);
		
		String email = sc.nextLine();
		int i = email.indexOf('@');
		System.out.println("UserName : " + email.substring(0,i));//programmer
		System.out.println("Domain   : " + email.substring(i+1,email.length()));//gmail.com
		
		
		//check whether the email is on gmail or not
		
		int j = email.indexOf(".");
		String name = email.substring(i+1,j);
		System.out.print("Domain if gmail : ");
		System.out.println(name.equals("gmail"));//true
		
		
		//
		
		
	}

}