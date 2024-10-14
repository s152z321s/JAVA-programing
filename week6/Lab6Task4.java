import java.util.Scanner;
public class Lab6Task4 {
    public static void main(String[] args) {
        
        final int NUMBER_OF_QUESTIONS = 5;
        int correctCount=0;
        int count=0;
        long starTime = System.currentTimeMillis();
        String output = " ";
        Scanner input=new Scanner(System.in);
        while(count<NUMBER_OF_QUESTIONS)
        {
            int n1=(int)(Math.random()*10);
            int n2=(int)(Math.random()*10);
            if(n1<n2)
            {
                int temp=n1;
                n1=n2;
                n2=temp;
            }
            System.out.println("What is "+n1+" - "+n2+"?");
            int ans=input.nextInt();
            if(n1-n2==ans)
            {
                System.out.println("You are right\n");
            }
            else
            {
                System.out.println("Your answer is wrong.\n"+n1+"-"+n2+"="+" should be"+(n1-n2)+"\n");
            }
            count++;

            output+="\n"+n1+"-"+n2+"="+ans+((n1-n2==ans)?"corrent":"wrong");
        }
        long endTime = System.currentTimeMillis();
        long testTime = endTime-starTime;

        System.out.println("Corrent count is "+correctCount+"\nTest time is "+testTime/1000+" seconds\n"+output);
    }
}
