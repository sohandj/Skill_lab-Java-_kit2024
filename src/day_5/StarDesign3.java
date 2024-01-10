package day_5;

public class StarDesign3 {

    public static void main(String[] args) {
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 8; j++) {
                if ((i + j == 4) || (j - i == 4) || (i - j == 4) || (i + j == 12)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

//output
//    *    
//   * *   
//  *   *  
// *     * 
//*       *