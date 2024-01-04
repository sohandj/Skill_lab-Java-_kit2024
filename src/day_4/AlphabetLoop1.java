package day_4;

public class AlphabetLoop1 {

	public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            char ch = 'a';
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }

	}

}
