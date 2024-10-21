
import java.util.Scanner;

public class lab4Task3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double score=input.nextDouble();
        System.out.print("The grade is ");
        printGrade(score);

    }
    public static void printGrade(double score){
        if(score>=90)
        {
            System.out.println('A');
        }
        else if(score>=80)
        {
            System.out.println("B");
        }
        else if(score>=70)
        {
            System.out.println("C");
        }
        else if(score>=60)
        {
            System.out.println("D");
        }
        else
        {
            System.out.println("F");
        }
    }
}
