package day_6;

public class StringOperation_02 {

	public static void main(String[] args) {
		String str = "NetBeans";
		System.out.println("Length     : "+ str.length());//8
		System.out.println("Lower Case : " + str.toLowerCase());//netbeans
		System.out.println("Upper Case : " + str.toUpperCase());//NETBEANS
		
		String str2 = "    net beans       ";
		System.out.println("Trim       : " + str2.trim());//net beans
		System.out.println("substring  : " + str.substring(3));//Beans
		System.out.println("substring  : " + str.substring(2,7));//tBean
		System.out.println("Replace    : " + str.replace('N','J'));//JetBeans
		
		System.out.println("StartsWith : " + str.startsWith(str));
		
	}

}
