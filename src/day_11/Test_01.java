package day_11;

public class Test_01 {
// construction overloading
	
	private int length;
	private int width;
	
	public Test_01(int length,int width) {
		this.length = length;
		this.width  = width;
	}
	
	public Test_01(int side) {
		this.length = side;
		this.width  = side;
	}
	
	public Test_01() {
		this.length = 0;
		this.width  = 0;
	}
	
	public static void main(String[] args) {
		
			
	}

}
