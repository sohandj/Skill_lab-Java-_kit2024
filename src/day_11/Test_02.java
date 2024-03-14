package day_11;

public class Test_02 {

	String name;
	int age;
	String usn;
	
	public Test_02(String name,int age,String usn) {
		this.name = name;
		this.age = age;
		this.usn = usn;
	}
	
	public static void main(String[] args) {
		
		Test_02 st0 = new Test_02("Ebinesh",21,"1ki21cs101");
		Test_02 st1 = new Test_02("Pavantn",21,"1ki21cs102");
		Test_02 st2 = new Test_02("Pavanmp",21,"1ki21cs103");
		
		System.out.println(st0.name +" "+ st0.age + " " + st0.usn);
		System.out.println(st1.name +" "+ st1.age + " " + st1.usn);
		System.out.println(st2.name +" "+ st2.age + " " + st2.usn);
	}

}
