import java.util.Scanner;

public class lab4Task14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first integer: ");
        int n1 = input.nextInt();
        System.out.println("Enter second integer: ");
        int n2 = input.nextInt();
        System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd(n1, n2));
        input.close();
    }

    public static int gcd(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        } else {
            return gcd(n2, n1 % n2);
        }
    }
}
