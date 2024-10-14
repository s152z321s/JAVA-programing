public class Lab6Task9 {
    public static void main(String[] args) {
        System.out.print(" ");
        for(int i=1;i<=4;i++)
        {
            System.out.print("   "+i);
        }
        System.out.println();
        for(int i=1;i<=4;i++)
        {
            System.out.print(i);
            for(int j=1;j<=i;j++)
            {
                System.out.print("   "+(i*j));
            }
            System.out.println();
        }
    }
}