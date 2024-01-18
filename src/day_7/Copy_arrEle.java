package day_7;

public class Copy_arrEle {
	public static void main (String[] args) {
		int num[] = {3,9,7,8,12,6,15,5,4,10};
		
		int num2[]= new int[num.length];
		for(int i = 0;i<num.length;i++) {
			num2[i] = num[i]; 
		}
		
		for(int i = 0;i<num.length;i++) {
			System.out.print(num2[i] + " ");
		}
	}
}
