package day_6;

public class String_01 {

	public static void main(String[] args) {

		String text1 = "super"; //stored in 
		String text2 = new String("super"); //stored in heap
		System.out.println(text1 +" "+ text2);
		
		String str11 = "Java";
		String str12 = "Java";
		System.out.println(str11 == str12); //true
		
		String str21 = "Java";
		String str22 = "java";
		System.out.println(str21 == str22); //false
		
		String str1 = "Java";
		String str2 = new String("Java");
		System.out.println(str1 == str2); //false

	}

}
