import java.util.Scanner;
public class Week5Task15 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String city1=input.nextLine();
        String city2=input.nextLine();
        System.out.printf("Else the cities inalphabetical order are ");
        if(city1.compareTo(city2)<0)
        {
            System.out.println(city1+" "+city2);
        }
        else
        {
            System.out.println(city2+" "+city1);
        }
    }
}
