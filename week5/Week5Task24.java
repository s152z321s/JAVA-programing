import java.util.Scanner;

public class Week5Task24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        String letter = input.nextLine().trim().toLowerCase();

  
        if (letter.length() != 1) {
            System.out.println("Invalid input.");
        } else {
            char ch = letter.charAt(0);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    System.out.println("The letter '" + ch + "' is a vowel.");
                } else {
                    System.out.println("The letter '" + ch + "' is a consonant.");
                }
            } else {
                System.out.println("Invalid input.");
            }
        }
        input.close();
    }
}
