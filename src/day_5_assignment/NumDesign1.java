package day_5_assignment;

public class NumDesign1 {

	public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print("  ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k + " ");
            }
            for (int l = 2; l <= i; l++) {
                System.out.print(l + " ");
            }
            System.out.println();
        }
	}
}


//output
//      1  
//    2 1 2 
//  3 2 1 2 3 
//4 3 2 1 2 3 4 