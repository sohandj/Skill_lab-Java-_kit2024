package day_5_assignment;

public class NumDesign2 {

	public static void main(String[] args) {
		
		int n = 10;
        for (int i = 1; i <= 4; i++) {
        	for (int k = i; k >= 1; k--) {
                System.out.print(n+ " ");
                n--;
            }
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print("  ");
            }
            System.out.println();
        }
	}

}
