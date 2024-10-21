public class lab4Task8 {
    public static void main(String[] args) {
        System.out.println("The first 50 prime number are\n");
        printPrimeNumber(50);
    }
    public static void printPrimeNumber(int num)
    {
        final int line=10;
        int count=0;
        int number=2;
        while(count<num)
        {
            if(isprime(number))
            {
                count++;
                if(count%line==0)
                {
                    System.out.printf("%-5d\n",number);
                }
                else
                {
                    System.err.printf("%-5d",number);
                }
            }
            number++;
        }

    }
    public static boolean isprime(int number)
    {
        for(int i=2;i*i<number;i++)
        {
            if(number%i==0)
            {
                return false;
            }
        }
        return true;
    }
}
