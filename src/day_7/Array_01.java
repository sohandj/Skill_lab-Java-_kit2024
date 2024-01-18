package day_7;

public class Array_01 {

	public static void main(String[] args) {
		int a[];
		a = new int[5];
		//int a[]= new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
//		for(int i =0 ;i<a.length;i++) {
//			System.out.println("Array :"+a[i]);
//		}
		
		
		//using for each loop to print array elements
		for(int x :a) {
			System.out.print(x + " ");
		}
		
	}

}
