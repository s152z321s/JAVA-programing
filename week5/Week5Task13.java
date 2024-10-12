import java.util.Scanner;
public class Week5Task13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a charactere: ");
        String s=input.nextLine();
        char ch=s.charAt(0);
        System.out.println("The character entered is "+ch);
    }
}
