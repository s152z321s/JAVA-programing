import java.util.Scanner;
public class Week5Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c;
        a=input.nextInt();
        b=input.nextInt();
        c=input.nextInt();
        double A=Math.acos(a*a-b*b-c*c)/(-2*b*c);
        double B=Math.acos(b*b-a*a-c*c)/(-2*a*c);
        double C=Math.acos(c*c-a*a-b*b)/(-2*a*b);
        System.out.println("The value of A、B、C: "+A+" "+B+" "+C);
    }
}
