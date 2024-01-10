package day_5;

public class NumDesign6 {

	public static void main(String[] args) {
		System.out.println("______________________________________________");
		for(int i = 1;i<=5;i++) {			
			for(int j=1;j<=5;j++) {
				if(i+j==6 || i==j) {
					System.out.print(i);
				}
				else {
					System.out.print(" ");	
				}
			}		
			System.out.println();
			
		}
		
		System.out.println("______________________________________________");
		// another
		for(int i = 1;i<=5;i++) {			
			for(int j=1;j<=5;j++) {
				if(i+j==6 || i==j) {
					System.out.print(j);
				}
				else {
					System.out.print(" ");	
				}
			}		
			System.out.println();
			
		}
		System.out.println("______________________________________________");
		// another
		for(int i = 1;i<=5;i++) {			
			for(int j=1;j<=5;j++) {
				if(i+j==6 || i==j) {
					System.out.print(i);
				}
				else {
					System.out.print(" ");	
				}
			}		
			System.out.println();
			
		}
	}

}


//output


//1   1
// 2 2 
//  3  
// 4 4 
//5   5

//1   5
// 2 4 
//  3  
// 2 4 
//1   5

//1   1
// 2 2 
//  3  
// 4 4 
//5   5