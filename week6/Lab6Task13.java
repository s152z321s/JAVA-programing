import java.util.Scanner;
public class Lab6Task13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first interger: ");
        int n1=input.nextInt();
        System.out.print("Enter second interger: ");
        int n2=input.nextInt();
        System.err.println("The greatest common divisor for "+n1+" and "+n2+" is "+max_gcd(n1, n2));
         
    }

    public static int max_gcd(int a,int b)
    {
        if(a<b)
        {
            int temp=a;
            a=b;
            b=temp;
        }
        if(a%b==0)
        {
            return b;
        }
        else{
            return max_gcd(b,a%b);
        }
    }
}
