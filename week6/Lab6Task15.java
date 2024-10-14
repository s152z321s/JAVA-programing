import java.util.Scanner;
public class Lab6Task15 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s=input.nextLine();
        int sign=1;
        for(int i=0;i<(s.length()/2);i++)
        {
            if(s.charAt(i)!=s.charAt(s.length()-1-i))
            {
                sign=0;
            }
        }
        if(sign==1)
        {
            System.out.println(s+" is a palindrome");
        }
        else
        {
            System.out.println(s+" is not a palindrome");
        }
    }
}
