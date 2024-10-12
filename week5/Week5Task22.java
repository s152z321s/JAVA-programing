import java.util.Scanner;
public class Week5Task22 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        if(a>15||a<0)
        {
            System.out.println(a+" is an invalid input");
            System.exit(0);
        }
        String s=Integer.toHexString(a);
        System.out.println("The hex value is "+s);
    }
}
