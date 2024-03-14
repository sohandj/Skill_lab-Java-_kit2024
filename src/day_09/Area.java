package day_09;

public class Area {
//	 square
	public double Area(double r) {
		return Math.PI + (r*r);
	}
	public int Area(int l,int b) {
		 return l * b;
	}
	public float area (float a) {
		return a*a;
	}
	
	public static void main(String[] args) {
		Area obj = new Area();
		
		System.out.println(obj.Area(20.5));
		System.out.println("area of rectangle" +obj.Area(20, 20));
		System.out.println(obj.Area(20, 20));
		
	}
}
