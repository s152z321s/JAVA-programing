import java.util.Arrays;
import java.util.Scanner;

public class Week5Task25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first city: ");
        String c1 = input.nextLine();
        System.out.println("Enter the second city: ");
        String c2 = input.nextLine();
        System.out.println("Enter the third city: ");
        String c3 = input.nextLine();
        String[] cities = {c1, c2, c3};
        Arrays.sort(cities);
        System.out.println("The three cities in alphabetical order are:");
        for (String city : cities) {
            System.out.println(city+" ");
        }
    }
}