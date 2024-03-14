package day_09;

public class Test1 {
	
	public int max(int x,int y) {
		return x>y?x:y;
	}
	
	public double max(double x , double y) {
		return x>y?x:y;
	}
	
	public int max(int x,int y,int z) {
		return x>y&&x>z?x:(y>z?y:z);
	}
	public static void main(String[] args) {
		Test1 mol = new Test1();
		mol.max(1,2);
		System.out.println(mol.max(20, 23));
		System.out.println(mol.max(20.4, 20.2));
		System.out.println(mol.max(20, 23,34));
	}
}