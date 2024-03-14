package day_08;

public class Gcd_num {
    static int gcd(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }

    public static void main(String[] args) {
        int a = 34;
        int b = 23;

        int c = gcd(a, b);

        System.out.println("GCD of " + a + " and " + b + " is: " + c);
    }
}
