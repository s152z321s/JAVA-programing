public class lab19 {
    public static void main(String[] args) {
        printMax(1,3,5,7);
        printMax(new double[] {1,3,5,7});
    }
    public static void printMax(double... number)
    {
        if(number.length==0)
        {
            System.out.println("No argument is passed");
            return ;
        }
        double max=number[0];
        for(int i=0;i<number.length;i++)
        {
            if(number[i]>max)
            {
                max=number[i];
            }
        }
        System.out.println("The max value is "+max);
    }
}
