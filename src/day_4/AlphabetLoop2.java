package day_4;

public class AlphabetLoop2 {

	public static void main(String[] args) {
		 char n = 'a';
         for (int i = 1; i <= 11; i++) {
             for (char j = 1; j <= i; j++) {
                 System.out.print( n + " ");
             }
            System.out.println(" ");
            n++;
            
        }
	}

}
