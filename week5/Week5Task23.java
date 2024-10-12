import java.util.Scanner;
public class Week5Task23 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double s=input.nextDouble();
        double r=s/(2*Math.sin(Math.PI/5));
        double Area=5*s*s/(4*Math.tan(Math.PI/5));
        System.out.println("The pentagon's area is: "+Area+" the center of the pentagon to a vertex is: "+r);
    }
}
