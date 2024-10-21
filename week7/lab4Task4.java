public class lab4Task4 {
    public static void main(String[] args) {
        System.out.print("The grade is "+printGrade(78.5));
        System.out.println("\nThe grade is "+printGrade(59.5));

    }
    public static char printGrade(double score){
        if(score>=90)
        {
            return 'A';
        }
        else if(score>=80)
        {
            return 'B';
        }
        else if(score>=70)
        {
            return 'C';
        }
        else if(score>=60)
        {
            return 'D';
        }
        else
        {
            return 'F';
        }
    }
}
