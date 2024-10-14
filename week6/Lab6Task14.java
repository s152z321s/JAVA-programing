import java.util.Scanner;
public class Lab6Task14 {
    public static void main(String[] args) {
        double money=10000;
        Scanner input=new Scanner(System.in);
        int year=input.nextInt();
        System.out.println("Tuition will be doubled in "+year+" years");
        for(int i=0;i<year;i++)
        {
            money=money*1.07;
        }
        System.out.println("Tuition will be $"+money+" in "+year+"years");
    }

}
